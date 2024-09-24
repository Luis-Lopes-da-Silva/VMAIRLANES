
package Model;


import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.OutputStream;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

public class Funcionalidades_DAO {
    public static String part = View.Destino_GUI.partida_TXT.getText();
    public static String dest = View.Destino_GUI.destino_TXT.getText();
    public static String dat = View.Destino_GUI.data_TXT.getText();
    public static String hor = View.Destino_GUI.hora_TXT.getText();
    
    public static String partI = View.Destino2_GUI.partidaIda_TXT.getText();
    public static String destI = View.Destino2_GUI.destinoIda_TXT.getText();
    public static String datI = View.Destino2_GUI.dataIda_TXT.getText();
    public static String horI = View.Destino2_GUI.horaIda_TXT.getText();
    public static String partV = View.Destino2_GUI.partidaVolta_TXT.getText();
    public static String destV = View.Destino2_GUI.destinoVolta_TXT.getText();
    public static String datV = View.Destino2_GUI.dataVolta_TXT.getText();
    public static String horV = View.Destino2_GUI.horaVolta_TXT.getText();
    
    public static String cpfC = View.FinalizarC_GUI.cpf_pas.getText();
    public static String nom = View.FinalizarC_GUI.nome_pas.getText();
    public static String clas = View.FinalizarC_GUI.classe_pas.getText();
    public static String assen = View.FinalizarC_GUI.assento_pas.getText();
    public static String bag = View.FinalizarC_GUI.bag_pas.getText();
    //public static String valorTotal_TXT = View.FinalizarC_GUI.valorT_pas.getText();
    public static int valorTotal;
    public static int valorBag;
    public static int valorPas;
    public static String parc;
    public static String metodoPagamento;
    public static int parcelas;
    public static int precoParc;
    public static String classEc = "ECONOMICA";
    public static String classEcP = "ECONOMICA PREMIUM";
    public static String classExe = "EXECUTIVA"; 
    
    
    

    public static void nomeCheckin(){
         View.CheckIn_GUI.nome_che.setText(nom);
         
         View.CheckIn_GUI.assento_che.setText(String.valueOf(assen));
         View.CheckIn_GUI.classe_che.setText(String.valueOf(clas));
         
         View.CheckIn_GUI.partida_che.setText(String.valueOf(part));
         View.CheckIn_GUI.destino_che.setText(String.valueOf(dest));
         View.CheckIn_GUI.data_che.setText(String.valueOf(dat));
         View.CheckIn_GUI.hora_che.setText(String.valueOf(hor));
    
    }
    public static void nomeCheckin2(){
         View.CheckIn2_GUI.nome2_che.setText(nom);
    
         View.CheckIn2_GUI.assento2_che.setText(String.valueOf(assen));
         View.CheckIn2_GUI.classe2_che.setText(String.valueOf(clas));
         
         View.CheckIn2_GUI.partidaIda_che.setText(String.valueOf(partI));
         View.CheckIn2_GUI.destinoIda_che.setText(String.valueOf(destI));
         View.CheckIn2_GUI.dataIda_che.setText(String.valueOf(datI));
         View.CheckIn2_GUI.horaIda_che.setText(String.valueOf(horI));
         View.CheckIn2_GUI.partidaVolta_che.setText(String.valueOf(partV));
         View.CheckIn2_GUI.destinoVolta_che.setText(String.valueOf(destV));
         View.CheckIn2_GUI.dataVolta_che.setText(String.valueOf(datV));
         View.CheckIn2_GUI.horaVolta_che.setText(String.valueOf(horV));
    }
    
    public static void Finalizar(){
     
        
       //testar classe
        if(View.FinalizarC_GUI.classe_pas.getText().toUpperCase().equals(classEc) || View.FinalizarC_GUI.classe_pas.getText().toUpperCase().equals(classEcP) || View.FinalizarC_GUI.classe_pas.getText().toUpperCase().equals(classExe)){
            JOptionPane.showMessageDialog(null, "Classe correta...");
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Digite a classe corretamente");
        }
        
        //preco das classes
        if(View.FinalizarC_GUI.classe_pas.getText().equals(classEc)){
            valorPas = 1000;
           
        }else if(View.FinalizarC_GUI.classe_pas.getText().equals(classEcP)){
            valorPas = 1500;
            
        }else if(View.FinalizarC_GUI.classe_pas.getText().equals(classExe)){
            valorPas = 2500;
        }
    
        valorBag = Integer.valueOf(bag) * 100;
        
        valorTotal = valorBag + valorPas;
        View.FinalizarC_GUI.valorT_pas.setText(String.valueOf("R$"+valorTotal));
           
    }
    
    
    
    
    
    //-----pagamento------------------------------------
    public static void pagamento(){
        
         String[] opcoesPagamento = {"Crédito", "Débito", "Pix"};
        
        // Solicitar método de pagamento
        metodoPagamento = (String) JOptionPane.showInputDialog(null, "Preço da Passagem R$"+valorTotal+",  Escolha o método de pagamento:", 
                "Método de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoesPagamento, opcoesPagamento[0]);

        if (metodoPagamento == null) {
            JOptionPane.showMessageDialog(null, "Nenhum método de pagamento selecionado.");
        } else {
            switch (metodoPagamento) {
                case "Crédito":
                case "Débito":
                    // Perguntar se o usuário quer parcelar a compra (permitido para crédito e débito)
                    int escolha = JOptionPane.showConfirmDialog(null, "Deseja parcelar a compra em até 5 vezes?", 
                            "Parcelamento", JOptionPane.YES_NO_OPTION);
                    
                    if (escolha == JOptionPane.YES_OPTION) {
                        // Solicitar o número de parcelas
                       
                        parc = JOptionPane.showInputDialog(null, "Em quantas vezes deseja parcelar (1 a 5)?");
                         
                        try {
                            parcelas = Integer.parseInt(parc);
                            
                            if (parcelas >= 1 && parcelas <= 5) {
                                JOptionPane.showMessageDialog(null, "Sua compra será parcelada em " + parcelas + " vezes no " 
                                        + metodoPagamento.toLowerCase() + ".");
                            } else {
                                JOptionPane.showMessageDialog(null, "Número de parcelas inválido. Escolha entre 1 e 5.");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, insira um número.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Compra à vista no " + metodoPagamento.toLowerCase() + " selecionada.");
                    }
                    break;

                case "Pix":
                    // Pagamento via Pix (sempre à vista)
                    JOptionPane.showMessageDialog(null, "Compra à vista via Pix selecionada.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Método de pagamento inválido.");
                    break;
            }
            
            precoParc = valorTotal/parcelas;
                    //------
        }
    
        }
    //-----pagamento------------------------------------
    
    
    public static void imprimir() throws FileNotFoundException, DocumentException, IOException{
    
        com.itextpdf.text.Document doc = null;
        OutputStream os = null;

        try {

            
            
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new com.itextpdf.text.Document(PageSize.A4, 72, 72, 72, 72);

            //cria a stream de saída
            os = new FileOutputStream("C:\\Users\\user\\Downloads\\VM\\NotaFiscalVM.pdf");

            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);

            //abre o documento
            doc.open();
            
            //adiciona o texto ao PDF
            
            Paragraph par1 = new Paragraph("                              NOTA FISCAL                           ");
            Paragraph par2 = new Paragraph("                                                                    ");
	    Paragraph par3 = new Paragraph("Cliente:       "+nom+"    CPF: "+cpfC+"                             ");
            Paragraph par4 = new Paragraph("                                                                    ");
            Paragraph par5 = new Paragraph("Preço das bagagens:      "+valorBag+"                               ");
            Paragraph par6 = new Paragraph("                                                                    ");
            Paragraph par7 = new Paragraph("Valor da passagem:   "+valorPas+"                                   ");    
            Paragraph par8 = new Paragraph("                                                                    ");
            Paragraph par9 = new Paragraph("Valor Total pago:       "+valorTotal+"                              "); 
            Paragraph par10 = new Paragraph("Método de pagamento:   "+metodoPagamento+"                         ");
            Paragraph par11 = new Paragraph("Parcelado em:          "+parcelas+" vezes    de  R$"+precoParc+"           ");    
            Paragraph par12 = new Paragraph("                                                                    ");
             
            doc.add(par1);
	    doc.add(par2);		
            doc.add(par3);
            doc.add(par4);
            doc.add(par5);
            doc.add(par6);
            doc.add(par7);
            doc.add(par8);
	    doc.add(par9);		
            doc.add(par10);
            doc.add(par11);
            doc.add(par12);
    
      
} finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
            }

            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
                Desktop.getDesktop().open(new File("NotaFiscalVM.pdf"));    
    
    }
    
    
    }

            
            

