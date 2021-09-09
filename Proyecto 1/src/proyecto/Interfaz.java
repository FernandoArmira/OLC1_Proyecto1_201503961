/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

// Importaciones Jfreechart
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Fernando Armira
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Editor
     */
    //public static String list_of_names="";
    public static ArrayList<Errores> listaErrores = new ArrayList<Errores>();
    public static ArrayList<Tokens> listaTokens = new ArrayList<Tokens>();
    public static ArrayList<variables> listavariables = new ArrayList<variables>();
    public static String nombrearchivo = "";
    public static Boolean archivoa = false;
    public static String nombrearchivojs = "";
    
    //Comentarios y variables
    public static ArrayList<String> variablestemp = new ArrayList();
    public static ArrayList<variablesJS> listavariablesjs = new ArrayList<variablesJS>();
    public static ArrayList<String> comentariostemp = new ArrayList();
    public static ArrayList<comentarioJS> listacomentariosjs = new ArrayList<comentarioJS>();
    
    //Clases
    public static ArrayList<String> clasestempA = new ArrayList();
    public static ArrayList<Integer> claseslineastempA = new ArrayList();
    public static ArrayList<String> clasesmetodostempA = new ArrayList();
    public static ArrayList<String> archivoclasesA = new ArrayList();
    public static ArrayList<String> clasestempB = new ArrayList();
    public static ArrayList<Integer> claseslineastempB = new ArrayList();
    public static ArrayList<String> clasesmetodostempB = new ArrayList();
    public static ArrayList<String> archivoclasesB = new ArrayList();
    public static ArrayList<clasesJS> listaclasesjs = new ArrayList<clasesJS>();
    public static int numlineasc = 0;
    public static String metodosc = "";
    
    //Metodos
    public static ArrayList<String> metodostempA = new ArrayList();
    public static ArrayList<Integer> metodosparamtempA = new ArrayList();
    public static ArrayList<Integer> metodoslineastempA = new ArrayList();
    public static ArrayList<String> archivometodosA = new ArrayList();
    public static ArrayList<String> metodostempB = new ArrayList();
    public static ArrayList<Integer> metodosparamtempB = new ArrayList();
    public static ArrayList<Integer> metodoslineastempB = new ArrayList();
    public static ArrayList<String> archivometodosB = new ArrayList();
    public static ArrayList<metodosJS> listametodosjs = new ArrayList<metodosJS>();
    public static int numparametros = 0;
    public static int numlineas = 0;

    //Puntaje general
    public static int comentariosg = 0;
    public static int variablesg = 0;
    public static int metodosg = 0;
    public static int clasesg = 0;
    public static int comentariosgB = 0;
    public static int variablesgB = 0;
    public static int metodosgB = 0;
    public static int clasesgB = 0;
    
    //Puntaje de cada archivo
    public static int comentariosl = 0;
    public static int variablesl = 0;
    public static int metodosl = 0;
    public static int clasesl = 0;
    public static int comentarioslB = 0;
    public static int variableslB = 0;
    public static int metodoslB = 0;
    public static int claseslB = 0;
    
    public static ArrayList<String> archivosproyecto = new ArrayList();
    public static ArrayList<Integer> rcomentarios = new ArrayList();
    public static ArrayList<Integer> rcomentariosB = new ArrayList();
    public static ArrayList<Integer> rvariables = new ArrayList();
    public static ArrayList<Integer> rvariablesB = new ArrayList();
    public static ArrayList<Integer> rmetodos = new ArrayList();
    public static ArrayList<Integer> rmetodosB = new ArrayList();
    public static ArrayList<Integer> rclases = new ArrayList();
    public static ArrayList<Integer> rclasesB = new ArrayList();
    
    
    public static double puntajegeneral = 0;
    
    //Puntaje especifico
    public static double puntaje = 0;
    
    //Nombre reportes a generar
    public String [] name;
    
    //Graficos a reportar
    public static ArrayList<String> lineasr = new ArrayList();
    public static ArrayList<String> barrasr = new ArrayList();
    public static ArrayList<String> pier = new ArrayList();
    
    public static String parametrospe;
    
    public Interfaz() {
        initComponents();
        jTextField1.setVisible(false);
        //jTextArea2.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ejecutar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)))
        );

        jTabbedPane1.addTab("Archivo 1", jPanel1);

        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jMenu1.setText("Abrir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Guardar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Guardar como");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        jMenuItem1.setText("Errores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Estadistico");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Tokens");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("JSON");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Archivos FCA", "fca");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            jTextArea1.setText("");
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());
            System.out.println("Path: " + chooser.getSelectedFile().getPath());
            jTextField1.setText(chooser.getSelectedFile().getPath());
            
            //String codigo = new String(), path = chooser.getSelectedFile().getPath();
            File archivo = new File(chooser.getSelectedFile().getPath());
            
            BufferedReader entrada;
            FileReader fr = null;
            
            try {
                fr = new FileReader(archivo);
                entrada = new BufferedReader(fr);
                String linea = entrada.readLine();

                while(linea != null){
                    jTextArea1.append(linea + "\n");
                    linea = entrada.readLine(); 
                    
                }
                
                jTextArea3.append("Archivo abierto: " + chooser.getSelectedFile().getPath() + "\n");
                nombrearchivo = chooser.getSelectedFile().getName();

            }catch(IOException e) {
                e.printStackTrace();
            }finally{
                try{                    
                    if(null != fr){   
                        fr.close();     
                    }                  
                }catch (Exception e2){ 
                    e2.printStackTrace();
                }
            }
            
           
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        try {
            if (jTextField1.getText().equals(""))
            {
                try {
            JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
            archivo.showSaveDialog(this);
            if (archivo.getSelectedFile() != null) {
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                    guardado.write(jTextArea1.getText());
                    JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta establecida");
                    jTextField1.setText(archivo.getSelectedFile().getPath());
                    jTextArea3.append("Archivo guardado correctamente \n");
                }
            }
            
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
     }
                
            
            }
            else 
            {
                FileWriter guardado = new FileWriter(jTextField1.getText());
                String texto = jTextArea1.getText().replace("\n", "\r\n");
                PrintWriter imprimir  = new PrintWriter(guardado);
                imprimir.print(texto);
                guardado.close();
                JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito");
            }
                    
            }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
     }   
        
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        
        try {
            JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
            archivo.showSaveDialog(this);
            if (archivo.getSelectedFile() != null) {
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                    guardado.write(jTextArea1.getText());
                    JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta establecida");
                    jTextField1.setText(archivo.getSelectedFile().getPath());
                    jTextArea3.append("Archivo guardado correctamente \n");
                    
                }
            }
            
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
     }   
 
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //list_of_names="";
        
        resetear();
        
        //jTextArea1.setText("");
        analizadores.parser.archivos.clear();
            
        try {
            System.out.println("Ejecutando analisis .....................................................");
            jTextArea3.append("Ejecutando analisis \n");
            String path = jTextArea1.getText();
            analizadores.parser sintactico;
            sintactico = new analizadores.parser(new analizadores.Lexico(new StringReader(path)));
            sintactico.parse();
            //jTextArea3.setText(list_of_names);
            System.out.println("------------------------------Variables----------------------------------");
            for(int i=0;i<listavariables.size();i++){
                System.out.println(listavariables.get(i).variable + " " + listavariables.get(i).valor);
            }
            
            System.out.println("-----------------------------VariablesJS----------------------------------");
            for(int i=0;i<listavariablesjs.size();i++){
                System.out.println(listavariablesjs.get(i).variable + " " + listavariablesjs.get(i).archivo);
            }
            
            System.out.println("----------------------------ComentariosJS---------------------------------");
            for(int i=0;i<listacomentariosjs.size();i++){
                System.out.println(listacomentariosjs.get(i).comentario + " " + listacomentariosjs.get(i).archivo);
            }
            
            /*System.out.println("------------------------------MetodosJS-------------------------------------");
            for(int i=0;i<metodostempA.size();i++){
                System.out.println(metodostempA.get(i) + " " + metodosparamtempA.get(i) + " " + metodoslineastempA.get(i) + " " + archivometodosA.get(i));
            }
            
            for(int i=0;i<metodostempB.size();i++){
                System.out.println(metodostempB.get(i) + " " + metodosparamtempB.get(i) + " " + metodoslineastempB.get(i) + " " + archivometodosB.get(i));
            }*/
            
            //puntajemetodos();
            
            System.out.println("-------------------------------Puntaje MetodosJS------------------------------------");
            for(int i=0;i<listametodosjs.size();i++){
                System.out.println(listametodosjs.get(i).metodo + " " + listametodosjs.get(i).archivo + " " + listametodosjs.get(i).id + " " + listametodosjs.get(i).lineas + " " + listametodosjs.get(i).parametros);
            }
            
            /*System.out.println("-------------------------------ClasesJS------------------------------------");
            
            for(int i=0;i<clasestempA.size();i++){
                System.out.println(clasestempA.get(i) + " "  + archivoclasesA.get(i)+ " " + clasesmetodostempA.get(i) + " " + claseslineastempA.get(i) + " ");
            }
          
            for(int i=0;i<clasestempB.size();i++){
                System.out.println(clasestempB.get(i) + " "  + archivoclasesB.get(i)+ " " + clasesmetodostempB.get(i) + " " + claseslineastempB.get(i) + " ");
            }*/
            
            //puntajeclases();
            
            System.out.println("-------------------------------Puntaje ClaseJS------------------------------------");
            for(int i=0;i<listaclasesjs.size();i++){
                System.out.println(listaclasesjs.get(i).clase + " " + listaclasesjs.get(i).archivo + " " + listaclasesjs.get(i).id + " "  + listaclasesjs.get(i).parametros + " " + listaclasesjs.get(i).lineas );
            }
             
            System.out.println("-------------------------------Puntaje General------------------------------------");
           
            puntajegeneral();
            
            System.out.println(puntajegeneral);
            
            System.out.println("-------------------------------Resumen------------------------------------");
            System.out.println(comentariosg + " " + comentariosgB);
            System.out.println(variablesg + " " + variablesgB);
            System.out.println(metodosg + " " + metodosgB);
            System.out.println(clasesg + " " + clasesgB);
            
            System.out.println("-------------------------------Errores ------------------------------------");
            for(int i=0;i<listaErrores.size();i++){
                System.out.println(listaErrores.get(i).valorError );
            }
            //+ metodosparamtempA.get(i) + " " + metodoslineastempA.get(i) + " "
            /*for(int i=0;i<listaclasesjs.size();i++){
                System.out.println(listaclasesjs.get(i).clase + " " + listaclasesjs.get(i).archivo);
            }*/
            
            /*if(true == true){
               System.out.println("a");
            }*/
            
        } catch (Exception e) {
        }
        
        /*for(int i =0; i<listaErrores.size();i++){
            System.out.println("i: "+i+" Tipo: "+listaErrores.get(i).tipoError+" valorError:"+listaErrores.get(i).valorError+" fila:"+listaErrores.get(i).fila+" Columna:"+listaErrores.get(i).columna);
        }*/
        name = nombrearchivo.split("\\.");
        
        try {
            glineasresumen("Resumen" + name[0]);
            jTextArea3.append("Finalizando Analisis \n");
            jTextArea3.append("Generando Reportes \n");
            
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        ReporteEstadistico("Estadistico" + name[0]);
        jTextArea3.append("Reporte Estadistico generado correctamente \n");
        ReporteTokens("Tokens" + name[0]);
        jTextArea3.append("Reporte Tokens generado correctamente \n");
        ReporteErrores("Errores" + name[0]);
        jTextArea3.append("Reporte Errores generado correctamente \n");
        ReporteJSON("JSON" + name[0]);
        jTextArea3.append("Reporte JSON generado correctamente \n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                // TODO add your handling code here:
                abrirarchivo("C:\\Users\\Fernando Armira\\Documents\\Reportes\\Errores" + name[0] + ".html");
                jTextArea3.append("Abriendo reporte de Errores \n");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        /*try {
            // TODO add your handling code here:
            gbarras();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        //Abrir reporte estadistico
        abrirarchivo("C:\\Users\\Fernando Armira\\Documents\\Reportes\\Estadistico" + name[0] + ".html");
        jTextArea3.append("Abriendo reporte Estadistico \n");

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                // TODO add your handling code here:
                abrirarchivo("C:\\Users\\Fernando Armira\\Documents\\Reportes\\Tokens" + name[0] + ".html");
                jTextArea3.append("Abriendo reporte de Tokens \n");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
            abrirarchivo("C:\\Users\\Fernando Armira\\Documents\\Reportes\\JSON" + name[0] + ".JSON");
            jTextArea3.append("Abriendo reporte JSON \n");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void ReporteErrores(String nombre){
        FileWriter fichero = null;
                PrintWriter pw = null;
                try {
                    
                    fichero = new FileWriter("C:\\Users\\Fernando Armira\\Documents\\Reportes\\" + nombre+ ".html");
                    pw = new PrintWriter(fichero);
                    //comenzamos a escribir el html
                    pw.println("<html>");
                    pw.println("<head><title>REPORTE DE ERRORES</title></head>");
                    pw.println("<body>");
                    pw.println("<div align=\"center\">");
                    pw.println("<h1>Reporte de Errores</h1>");
                    pw.println("<br></br>");
                    pw.println("<table border=1>");
                    pw.println("<tr>");
                    pw.println("<td>TIPO</td>");
                    pw.println("<td>VALOR</td>");
                    pw.println("<td>FILA</td>");
                    pw.println("<td>COLUMNA</td>");
                    pw.println("<td>ARCHIVO</td>");
                    pw.println("</tr>");
                    for(int i=0;i<listaErrores.size();i++){
                        pw.println("<tr>");
                        pw.println("<td>"+listaErrores.get(i).getTipoError()+"</td>");
                        pw.println("<td>"+listaErrores.get(i).getValorError()+"</td>");
                        pw.println("<td>"+listaErrores.get(i).getFila()+"</td>");
                        pw.println("<td>"+listaErrores.get(i).getColumna()+"</td>");
                        pw.println("<td>"+listaErrores.get(i).getArchivo()+"</td>");
                        pw.println("</tr>");
                    }
                    pw.println("</table>");
                    pw.println("</div");
                    pw.println("</body>");
                    pw.println("</html>");
                } catch (Exception e) {
                }finally{
                    if(null!=fichero){
                        try {
                            fichero.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                try {
            //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Reportes\\"+"Reporte ErroresL.html");
            //System.out.println("Final");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ReporteTokens(String nombre){
        FileWriter fichero = null;
                PrintWriter pw = null;
                try {
                    
                    fichero = new FileWriter("C:\\Users\\Fernando Armira\\Documents\\Reportes\\" + nombre+ ".html");
                    pw = new PrintWriter(fichero);
                    //comenzamos a escribir el html
                    pw.println("<html>");
                    pw.println("<head><title>REPORTE DE Tokens</title></head>");
                    pw.println("<body>");
                    pw.println("<div align=\"center\">");
                    pw.println("<h1>Reporte de Tokens</h1>");
                    pw.println("<br></br>");
                    pw.println("<table border=1>");
                    pw.println("<tr>");
                    pw.println("<td>TOKEN</td>");
                    pw.println("<td>LEXEMA</td>");
                    pw.println("<td>FILA</td>");
                    pw.println("<td>COLUMNA</td>");
                    pw.println("<td>ARCHIVO</td>");
                    pw.println("</tr>");
                    for(int i=0;i<listaTokens.size();i++){
                        pw.println("<tr>");
                        pw.println("<td>"+listaTokens.get(i).getTipoError()+"</td>");
                        pw.println("<td>"+listaTokens.get(i).getValorError()+"</td>");
                        pw.println("<td>"+listaTokens.get(i).getFila()+"</td>");
                        pw.println("<td>"+listaTokens.get(i).getColumna()+"</td>");
                        pw.println("<td>"+listaTokens.get(i).getArchivo()+"</td>");
                        pw.println("</tr>");
                    }
                    pw.println("</table>");
                    pw.println("</div");
                    pw.println("</body>");
                    pw.println("</html>");
                } catch (Exception e) {
                }finally{
                    if(null!=fichero){
                        try {
                            fichero.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                try {
            //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Reportes\\"+"Reporte ErroresL.html");
            //System.out.println("Final");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void puntajemetodos(){
        double pid;
        double pparam;
        double plineas;
        
        // Metodos Archivos Proyecto B
        
        for(int i=0;i<metodostempB.size();i++){
                int estado = 0;
                String idmetodo = metodostempB.get(i);
                for(int j=0;j<metodostempA.size();j++){
                    if(idmetodo.equals(metodostempA.get(j))){
                        pid = 0.4;
                        if(metodosparamtempB.get(i) == metodosparamtempA.get(j)){
                            pparam = 0.3;
                        } else {
                            pparam = 0;
                        }
                        
                        if(metodoslineastempB.get(i) == metodoslineastempA.get(j)){
                            plineas = 0.3;
                        } else {
                            plineas = 0;
                        }
                        
                        j = metodostempA.size();
                        estado = 1;
                        
                        metodosJS nuevov= new metodosJS(idmetodo, archivometodosB.get(i),pid, pparam, plineas);
                        listametodosjs.add(nuevov);
                        
                    }
                             
                }
                
                if(estado == 0){
                    
                    pid = 0;
                    
                    int estado2 = 0;
                    for(int j=0;j<metodoslineastempA.size();j++){
                        if(metodoslineastempB.get(i) == metodoslineastempA.get(j)){
                            
                            plineas = 0.3;
                            
                            if(metodosparamtempB.get(i) == metodosparamtempA.get(j)){
                                pparam = 0.3;
                            }
                            else {
                                pparam = 0;
                            }
                            
                            j = metodoslineastempA.size();
                            estado2 = 1;
                        
                            metodosJS nuevov= new metodosJS(idmetodo, archivometodosB.get(i),pid, pparam, plineas);
                            listametodosjs.add(nuevov);
     
                        }                        
                    }
                    
                    if(estado2 == 0){
                        plineas = 0;
                        pparam = 0;
                        
                        metodosJS nuevov= new metodosJS(idmetodo, archivometodosB.get(i),pid, pparam, plineas);
                        listametodosjs.add(nuevov);
                    }
                
                }
    
        }
        
        // Metodos Archivo A
        for(int i=0;i<metodostempA.size();i++){
            int estado0 = 0;
            String idmetodo = metodostempA.get(i);
                for(int j=0;j<listametodosjs.size();j++){
                    if(metodostempA.get(i).equals(listametodosjs.get(j).metodo) && archivometodosA.get(i).equals(listametodosjs.get(j).archivo)){
                        estado0 = 1;
                        j = listametodosjs.size();
                    }  
                }
                
            if(estado0 == 0){
                
                pid = 0;
                    
                    int estado2 = 0;
                    for(int j=0;j<metodoslineastempB.size();j++){
                        if(metodoslineastempA.get(i) == metodoslineastempB.get(j)){
                            
                            plineas = 0.3;
                            
                            if(metodosparamtempA.get(i) == metodosparamtempB.get(j)){
                                pparam = 0.3;
                            }
                            else {
                                pparam = 0;
                            }
                            
                            j = metodoslineastempB.size();
                            estado2 = 1;
                        
                            metodosJS nuevov= new metodosJS(idmetodo, archivometodosA.get(i),pid, pparam, plineas);
                            listametodosjs.add(nuevov);
     
                        }                        
                    }
                    
                    if(estado2 == 0){
                        plineas = 0;
                        pparam = 0;
                        
                        metodosJS nuevov= new metodosJS(idmetodo, archivometodosA.get(i),pid, pparam, plineas);
                        listametodosjs.add(nuevov);
                    }
                
                
            }
            
            
        }
    
    }
    

    
    public static void puntajeclases() {
        // Clases Archivos Proyecto B
        
        double pid;
        double pmetodos;
        double plineas;
        
        for(int i=0;i<clasestempB.size();i++){
                int estado = 0;
                String idmetodo = clasestempB.get(i);
                for(int j=0;j<clasestempA.size();j++){
                    if(idmetodo.equals(clasestempA.get(j))){
                        pid = 0.2;
                        if(claseslineastempB.get(i) == claseslineastempA.get(j)){
                            plineas = 0.4;
                        } else {
                            plineas = 0;
                        }
                        
                        //Calcular puntaje metodos
                        int totalmetodos = 0;
                        double puntaje = 0;
                        
                        String [] B = clasesmetodostempB.get(i).split("-");
                        String [] A = clasesmetodostempA.get(j).split("-");
                        ArrayList<String> C = new ArrayList();
                        
                        if(A.length > B.length){
                            totalmetodos = A.length - 1;
                        } else if (A.length < B.length){
                            totalmetodos = B.length - 1;
                        } else if (A.length == B.length){
                            totalmetodos = A.length - 1;
                        }
                        
                        for(int k=0;k<B.length;k++){
                            for(int l=0;l<A.length;l++){
                                if(B[k].equals(A[l])){
                                    C.add(B[k]);
                                    l = A.length;
                                }
                            
                            }
                               
                        }
                        
                        for(int k=0;k<C.size();k++){
                            for(int l=0;l<listametodosjs.size();l++){
                                if(C.get(k).equals(listametodosjs.get(l).metodo)){
                                    puntaje = puntaje + listametodosjs.get(l).id + listametodosjs.get(l).lineas + listametodosjs.get(l).parametros;
                                    l = listametodosjs.size();
                                }
                            
                            }
                               
                        }
                        
                        pmetodos = (puntaje / totalmetodos) * 0.4;
                        
                        
                        j = clasestempA.size();
                        estado = 1;
                        
                        clasesJS nuevov= new clasesJS(idmetodo, archivoclasesB.get(i),pid, pmetodos, plineas);
                        listaclasesjs.add(nuevov);
                        
                    }
                             
                }
                
                if(estado == 0){
                    
                    pid = 0;
                    pmetodos = 0;
                    
                    int estado2 = 0;
                    for(int j=0;j<claseslineastempA.size();j++){
                        if(claseslineastempB.get(i) == claseslineastempA.get(j)){
                            
                            plineas = 0.4;
                            
                            j = claseslineastempA.size();
                            estado2 = 1;
                        
                            clasesJS nuevov= new clasesJS(idmetodo, archivoclasesB.get(i),pid, pmetodos, plineas);
                            listaclasesjs.add(nuevov);
     
                        }                        
                    }
                    
                    if(estado2 == 0){
                        plineas = 0;
                        
                        clasesJS nuevov= new clasesJS(idmetodo, archivoclasesB.get(i),pid, pmetodos, plineas);
                        listaclasesjs.add(nuevov);
                    }
                
                }
    
        }
        
        // Metodos Archivo A
        for(int i=0;i<clasestempA.size();i++){
            int estado0 = 0;
            String idmetodo = clasestempA.get(i);
                for(int j=0;j<listaclasesjs.size();j++){
                    if(clasestempA.get(i).equals(listaclasesjs.get(j).clase) && archivoclasesA.get(i).equals(listaclasesjs.get(j).archivo)){
                        estado0 = 1;
                        j = listaclasesjs.size();
                    }  
                }
                
            if(estado0 == 0){
                    
                    pid = 0;
                    pmetodos = 0;
                    
                    int estado2 = 0;
                    for(int j=0;j<claseslineastempB.size();j++){
                        if(claseslineastempA.get(i) == claseslineastempB.get(j)){
                            
                            plineas = 0.4;
                            
                            j = claseslineastempB.size();
                            estado2 = 1;
                        
                            clasesJS nuevov= new clasesJS(idmetodo, archivoclasesA.get(i),pid, pmetodos, plineas);
                            listaclasesjs.add(nuevov);
     
                        }                        
                    }
                    
                    if(estado2 == 0){
                        plineas = 0;
                        
                        clasesJS nuevov= new clasesJS(idmetodo, archivoclasesA.get(i),pid, pmetodos, plineas);
                        listaclasesjs.add(nuevov);
                    }
                
                }
            
            
        }
    
        
    }
    
    //Puntaje general
    public static void puntajegeneral(){
        float pcom = 0;
        float pvar = 0;
        float pmet = 0;
        float pcla = 0;
        
        int metodos = 0;
        int clases = 0;
        
      
        pcom = ((float)listacomentariosjs.size()/((float)comentariosg + (float)comentariosgB))*(float)0.2;
        /*System.out.println(listacomentariosjs.size());
        System.out.println(comentariosg);
        System.out.println(pcom);*/
        pvar = ((float)listavariablesjs.size()/((float)variablesg + (float)variablesgB))*(float)0.2;
        
        for(int i=0;i<listametodosjs.size();i++){
            double puntaje = 0;
            puntaje = listametodosjs.get(i).id + listametodosjs.get(i).lineas + listametodosjs.get(i).parametros;
            //System.out.println(listametodosjs.get(i).metodo + " " + listametodosjs.get(i).archivo + " " + listametodosjs.get(i).id + " " + listametodosjs.get(i).lineas + " " + listametodosjs.get(i).parametros);
            
            if(puntaje >= 0.60){
                metodos++;
            }
        }
        
        pmet = ((float)metodos/((float)metodosg + (float)metodosgB))*(float)0.3;
        
        for(int i=0;i<listaclasesjs.size();i++){
            double puntaje = 0;
            puntaje = listaclasesjs.get(i).id + listaclasesjs.get(i).lineas + listaclasesjs.get(i).parametros;
            //System.out.println(listametodosjs.get(i).metodo + " " + listametodosjs.get(i).archivo + " " + listametodosjs.get(i).id + " " + listametodosjs.get(i).lineas + " " + listametodosjs.get(i).parametros);
            
            if(puntaje >= 0.60){
                clases++;
            }
        }
        
        pcla = ((float)clases/((float)clasesg + (float)clasesgB))*(float)0.3;
        
        puntajegeneral = pcom + pvar + pmet + pcla;
        
        /*System.out.println("---");
        System.out.println(pcom);
        System.out.println(pvar);
        System.out.println(pmet);
        System.out.println(pcla);*/
    }  
    
    
    public static void resetear(){
        listaErrores.clear();
        listaTokens.clear();
        listavariables.clear();
        listavariablesjs.clear();
        listacomentariosjs.clear();
        listametodosjs.clear();
        listaclasesjs.clear();
        comentariosg = 0;
        variablesg = 0;
        metodosg = 0;
        clasesg = 0;
        comentariosgB = 0;
        variablesgB = 0;
        metodosgB = 0;
        clasesgB = 0;
        archivosproyecto.clear();
        rcomentarios.clear();
        rcomentariosB.clear();
        rvariables.clear();
        rvariablesB.clear();
        rmetodos.clear();
        rmetodosB.clear();
        rclases.clear();
        rclasesB.clear();
        puntajegeneral = 0;
        lineasr.clear();
        barrasr.clear();
        pier.clear();
    }
   
    
    // REPORTES
    
    public void ReporteEstadistico(String nombre){
        FileWriter fichero = null;
                PrintWriter pw = null;
                try {
                    
                    fichero = new FileWriter("C:\\Users\\Fernando Armira\\Documents\\Reportes\\" + nombre+ ".html");
                    pw = new PrintWriter(fichero);
                    //comenzamos a escribir el html
                    pw.println("<html>");
                    pw.println("<head><title>REPORTE ESTADISTICO</title></head>");
                    pw.println("<body>");
                    pw.println("<div align=\"center\">");
                    pw.println("<h1>Reporte Estadistico</h1>");
                    pw.println("<br></br>");
                    pw.println("<h3>Resumen</h3>");
                    pw.println("<table border=1>");
                    pw.println("<tr>");
                    pw.println("<td>Tipo</td>");
                    pw.println("<td>Proyecto A</td>");
                    pw.println("<td>Proyecto B</td>");
                    pw.println("</tr>");
                    pw.println("<tr>");
                    pw.println("<td>Total variables</td>");
                    pw.println("<td>" + variablesg + "</td>");
                    pw.println("<td>" + variablesgB + "</td>");
                    pw.println("</tr>");
                    pw.println("<tr>");
                    pw.println("<td>Total clases</td>");
                    pw.println("<td>" + clasesg + "</td>");
                    pw.println("<td>" + clasesgB + "</td>");
                    pw.println("</tr>");
                    pw.println("<tr>");
                    pw.println("<td>Total metodos</td>");
                    pw.println("<td>" + metodosg + "</td>");
                    pw.println("<td>" + metodosgB + "</td>");
                    pw.println("</tr>");
                    pw.println("<tr>");
                    pw.println("<td>Total comentarios</td>");
                    pw.println("<td>" + comentariosg + "</td>");
                    pw.println("<td>" + comentariosgB + "</td>");
                    pw.println("</tr>");
                    /*for(int i=0;i<listaErrores.size();i++){
                        pw.println("<tr>");
                        pw.println("<td>"+listaErrores.get(i).getTipoError()+"</td>");
                        pw.println("<td>"+listaErrores.get(i).getValorError()+"</td>");
                        pw.println("<td>"+listaErrores.get(i).getFila()+"</td>");
                        pw.println("<td>"+listaErrores.get(i).getColumna()+"</td>");
                        pw.println("</tr>");
                    }*/
                    pw.println("</table>");
                    pw.println("<br></br>");
                    for(int i=0;i<lineasr.size();i++){
                        pw.println("<img src= \"C:\\Users\\Fernando Armira\\Documents\\GitHub\\OLC1_Proyecto1_201503961\\Proyecto 1\\" + lineasr.get(i) + "\">");
                    }
                    pw.println("<br></br>");
                    
                    pw.println("<h3>Grafica de barras</h3>");
                    pw.println("<br></br>");
                    for(int i=0;i<barrasr.size();i++){
                        pw.println("<img src= \"C:\\Users\\Fernando Armira\\Documents\\GitHub\\OLC1_Proyecto1_201503961\\Proyecto 1\\" + barrasr.get(i) + "\">");
                    }
                    pw.println("<br></br>");
                    
                    pw.println("<h3>Grafica de pie</h3>");
                    pw.println("<br></br>");
                    for(int i=0;i<pier.size();i++){
                        pw.println("<img src= \"C:\\Users\\Fernando Armira\\Documents\\GitHub\\OLC1_Proyecto1_201503961\\Proyecto 1\\" + pier.get(i) + "\">");
                    }
                    pw.println("<br></br>");
                    
                    
                    pw.println("<h3>Datos finales</h3>");
                    pw.println("<h4>Nombre: Fernando Augusto Armira Ramírez</h4>");
                    pw.println("<h4>Carnet: 201503961</h4>");
                    pw.print("<h4>Fecha y hora: ");
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    //System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
                    pw.println(dtf.format(LocalDateTime.now()) + "</h4>");
                    pw.println("</div");
                    pw.println("</body>");
                    pw.println("</html>");
                } catch (Exception e) {
                }finally{
                    if(null!=fichero){
                        try {
                            fichero.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                try {
            //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Reportes\\"+"Reporte ErroresL.html");
            //System.out.println("Final");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ReporteJSON(String nombre){
        FileWriter fichero = null;
                PrintWriter pw = null;
                try {
                    
                    fichero = new FileWriter("C:\\Users\\Fernando Armira\\Documents\\Reportes\\" + nombre+ ".JSON");
                    pw = new PrintWriter(fichero);
                    //comenzamos a escribir el html
                    pw.println("{");
                    pw.println("    \"PuntajeGeneral\":" + puntajegeneral);
                    pw.println("    \"PuntajeEspecificos\":[");
                    for(int i=0;i<listavariablesjs.size();i++){
                        pw.println("        {");
                        pw.println("            \"archivo:\" : \"" + listavariablesjs.get(i).archivo + "\"," );
                        pw.println("            \"tipo:\" : \"variable\"," );
                        pw.println("            \"nombre:\" : \"" + listavariablesjs.get(i).variable + "\"," );
                        pw.println("            \"puntaje:\" : 1" );
                        pw.println("        },");
                    }
                    for(int i=0;i<listacomentariosjs.size();i++){
                        pw.println("        {");
                        pw.println("            \"archivo:\" : \"" + listacomentariosjs.get(i).archivo + "\"," );
                        pw.println("            \"tipo:\" : \"comentario\"," );
                        pw.println("            \"nombre:\" : \"" + listacomentariosjs.get(i).comentario + "\"," );
                        pw.println("            \"puntaje:\" : 1" );
                        pw.println("        },");
                    }
                    for(int i=0;i<listametodosjs.size();i++){
                        pw.println("        {");
                        pw.println("            \"archivo:\" : \"" + listametodosjs.get(i).archivo + "\"," );
                        pw.println("            \"tipo:\" : \"metodo\"," );
                        pw.println("            \"nombre:\" : \"" + listametodosjs.get(i).metodo + "\"," );
                        double puntaje = listametodosjs.get(i).id + listametodosjs.get(i).lineas + listametodosjs.get(i).parametros;
                        pw.println("            \"puntaje:\" :" + puntaje );
                        pw.println("        },");
                    }
                    
                    for(int i=0;i<listaclasesjs.size() - 1;i++){
                        pw.println("        {");
                        pw.println("            \"archivo:\" : \"" + listaclasesjs.get(i).archivo + "\"," );
                        pw.println("            \"tipo:\" : \"clase\"," );
                        pw.println("            \"nombre:\" : \"" + listaclasesjs.get(i).clase + "\"," );
                        double puntaje = listaclasesjs.get(i).id + listaclasesjs.get(i).lineas + listaclasesjs.get(i).parametros;
                        pw.println("            \"puntaje:\" :" + puntaje );
                        pw.println("        },");
                    }
                    pw.println("        {");
                    pw.println("            \"archivo:\" : \"" + listaclasesjs.get(listaclasesjs.size() - 1).archivo + "\"," );
                    pw.println("            \"tipo:\" : \"clase\"," );
                    pw.println("            \"nombre:\" : \"" + listaclasesjs.get(listaclasesjs.size() - 1).clase + "\"," );
                    double puntaje = listaclasesjs.get(listaclasesjs.size() - 1).id + listaclasesjs.get(listaclasesjs.size() - 1).lineas + listaclasesjs.get(listaclasesjs.size() - 1).parametros;
                    pw.println("            \"puntaje:\" :" + puntaje );
                    pw.println("        }");
                    pw.println("    ]");
                    pw.println("}");
                } catch (Exception e) {
                }finally{
                    if(null!=fichero){
                        try {
                            fichero.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                try {
            //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Reportes\\"+"Reporte ErroresL.html");
            //System.out.println("Final");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void abrirarchivo(String archivo){

     try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }
    }

     
     // Grafica de lineas resumen

    public static void glineasresumen(String nombre) throws IOException{

        final XYSeries serie1 = new XYSeries("Fernando Alonso");
        
        serie1.add(1, proyecto.Interfaz.variablesg);
        serie1.add(2, proyecto.Interfaz.metodosg);
        serie1.add(3, proyecto.Interfaz.clasesg);
        serie1.add(4, proyecto.Interfaz.comentariosg);
    
	
		
	final XYSeries serie2 = new XYSeries("Jaime Alguersuari");

        serie2.add(1, proyecto.Interfaz.variablesgB);
        serie2.add(2, proyecto.Interfaz.metodosgB);
        serie2.add(3, proyecto.Interfaz.clasesgB);
        serie2.add(4, proyecto.Interfaz.comentariosgB);

		
	final XYSeriesCollection collection = new XYSeriesCollection();
	collection.addSeries(serie1);
	collection.addSeries(serie2);
        
        JFreeChart chart = 
        ChartFactory.createXYLineChart("Resumen Proyecto",  
        "1.variables  2.metodos  3.clases  4.comentarios","Numero",collection,PlotOrientation.VERTICAL,
        false,
        false, 
        true                // Show legend
        );
        
        //Mostramos la grafica en pantalla
        /*ChartFrame frame = new ChartFrame("Ejemplo Grafica Circular", chart);
        frame.pack();
        frame.setVisible(true);*/

        //Crear imaagen de la grafica
        int width = 640; // Width of the image 
        int height = 480; // Height of the image 
        File XYChart = new File( nombre + ".jpeg" );
        ChartUtilities.saveChartAsJPEG( XYChart , chart , width , height );

        proyecto.Interfaz.lineasr.add(nombre + ".jpeg");

    } 
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
