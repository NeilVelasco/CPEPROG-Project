/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpeprog;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class RecipeGUI extends javax.swing.JFrame {
    static HashMap<String, Object> data;    

    /**
     * Creates new form MainGUI
     */
    public RecipeGUI() {
        initComponents();
        data=new HashMap<>();
    }
    public RecipeGUI(HashMap<String,Object> data) {
        initComponents();
        this.data=data;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        recipeTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        procedureTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredientsTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jPopupMenu1.setMaximumSize(new java.awt.Dimension(20, 50));
        jPopupMenu1.setMinimumSize(new java.awt.Dimension(100, 100));

        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jMenuItem2);

        jMenu1.setText("Categories");

        jMenuItem1.setText("Appetizers");

        jMenuItem2.setText("Desserts");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIRTUAL CHEF    ||   Cook, Create, Share");

        searchField.setFont(new java.awt.Font("Avalon", 0, 11)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Avalon", 0, 11)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        menuButton.setFont(new java.awt.Font("Avalon", 0, 11)); // NOI18N
        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        //imageIcon = new javax.swing.ImageIcon(getClass().getResource("search.png"));
        //image = imageIcon.getImage(); // transform it
        //newimg = image.getScaledInstance(25, 25,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        //imageIcon = new ImageIcon(newimg);  // transform it back
        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        //jLabel2.setIcon(imageIcon);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        recipeTitle.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 24)); // NOI18N
        if(foodName.isEmpty()){
            recipeTitle.setText("Untitled Recipe");
        }
        else {
            recipeTitle.setText(foodName);
        }

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Avalon", 1, 14)); // NOI18N
        jLabel6.setText("Procedure");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBar(null);

        procedureTextArea.setColumns(20);
        procedureTextArea.setLineWrap(true);
        procedureTextArea.setRows(5);
        procedureTextArea.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut justo ipsum, mollis ut malesuada vel, venenatis ac purus. Etiam egestas non urna ut interdum. Aliquam eget dolor imperdiet, pellentesque quam at, venenatis neque. Duis ultrices a lorem nec viverra. Integer ultricies ex eu diam mattis maximus id sed massa. Integer eget odio dolor. Morbi luctus maximus sapien, et scelerisque dolor maximus id. Etiam ut mauris pulvinar, pellentesque neque suscipit, semper eros. Mauris quam sapien, egestas non nunc feugiat, dictum vehicula felis. In dignissim sit amet erat et imperdiet. Nulla pellentesque arcu nec eros posuere, id lobortis quam molestie. Sed ut diam sit amet odio faucibus dignissim. In rhoncus dolor nibh, quis dignissim diam porta eget. Morbi dictum, augue ac interdum lacinia, eros mauris tempor libero, a mattis enim arcu et felis.  Sed purus orci, volutpat ut porta vitae, faucibus non purus. Vivamus hendrerit mattis accumsan. Curabitur ut dolor urna. Etiam pellentesque eros velit, pretium porta erat ullamcorper a. Mauris porta, diam sit amet dapibus feugiat, libero velit faucibus enim, in pharetra libero lacus sit amet tellus. Duis elit magna, scelerisque luctus diam vel, convallis accumsan est. Pellentesque velit leo, lacinia sed nulla eget, efficitur pharetra erat. Morbi luctus massa eget felis posuere, in ornare tortor viverra. Phasellus iaculis dui quis sapien malesuada consectetur. Aenean luctus vel purus at sagittis. Donec convallis, velit vitae mollis vehicula, massa dolor placerat quam, tristique ullamcorper ex purus eget purus. Suspendisse id efficitur tortor. Curabitur efficitur mi aliquet ligula hendrerit, elementum varius est aliquet. Sed dictum nibh vitae velit suscipit euismod. Morbi tincidunt sem ut ligula venenatis, eget tincidunt nulla commodo.  Fusce at fermentum erat, interdum mollis justo. Sed lobortis mauris sem, malesuada accumsan turpis tincidunt in. Quisque felis odio, gravida sed imperdiet quis, pharetra at velit. Maecenas eu odio quis elit placerat rhoncus eu in dui. Integer vitae euismod risus. Nam ullamcorper ac odio posuere viverra. Donec et egestas elit. Pellentesque dapibus dolor et neque lacinia condimentum. Duis cursus ex nec eros cursus, a convallis tortor egestas.  Mauris eget leo fringilla, suscipit dui eget, euismod neque. Nullam pretium, libero quis maximus faucibus, purus ipsum semper nunc, vitae lobortis purus dolor sit amet mauris. Maecenas dignissim nisl eget finibus cursus. Praesent id gravida dolor. Vivamus sit amet augue sit amet ante ornare tempor at at sapien. Fusce finibus vel nunc non dapibus. Duis eget vestibulum metus. Vestibulum varius sodales tempor. Sed a elit tristique sapien maximus viverra. Sed quis ultrices massa.  Etiam a consectetur augue, non facilisis est. Duis semper placerat lectus, id aliquet magna ultrices quis. Vivamus molestie viverra neque, a scelerisque ligula cursus ac. Nulla scelerisque, libero quis mattis facilisis, urna quam lacinia lacus, vel pharetra nisl mauris a felis. Nunc a laoreet erat. Nulla quis odio eget erat pulvinar tincidunt. Suspendisse cursus gravida mollis. In tincidunt mauris id mollis feugiat. Maecenas varius metus ac dolor ullamcorper, ac mollis odio convallis. Donec erat nisi, imperdiet sed lacinia et, auctor non risus. Donec sit amet diam rhoncus, rutrum libero ac, pharetra dui. Vestibulum cursus varius urna, vitae fermentum sem lobortis nec. Nullam dignissim nunc at condimentum mollis. Nunc a mauris nisl. Nam dignissim nunc sit amet nisl mollis, eu molestie augue mollis. Phasellus pellentesque consequat ipsum, non luctus libero placerat eget.  Suspendisse potenti. Vivamus placerat orci eu quam luctus sollicitudin. Ut cursus dictum suscipit. Curabitur blandit eget mauris at tempus. Etiam nec facilisis purus. Donec ullamcorper, leo non bibendum convallis, dolor nulla condimentum nibh, eu semper turpis elit sed eros. Suspendisse feugiat urna ac ex porttitor mattis. Nulla tempor aliquet lectus, eget suscipit tortor posuere id. Morbi id eros ornare felis vulputate molestie quis eget nisl. Maecenas gravida elementum lorem, sit amet viverra nisi. Aenean efficitur ligula non sollicitudin sodales. Proin vitae elit nec est tempor euismod id eget nunc. Proin tristique pretium congue. In elementum risus dui, quis rhoncus arcu vehicula eu. Sed luctus, elit pharetra malesuada porttitor, augue elit dapibus arcu, sed lobortis erat felis eu urna. Pellentesque finibus lorem at blandit faucibus.  Nunc eu luctus elit. Phasellus rutrum augue enim, vitae mattis metus vestibulum non. Nulla sit amet massa feugiat, molestie lorem sed, imperdiet ex. Nunc nisl augue, consequat quis fermentum at, interdum ac lacus. Pellentesque eget luctus est, vitae maximus mi. Sed auctor tortor quis nulla pulvinar, at condimentum dui egestas. Duis venenatis vitae dui at placerat. Ut porta magna ut nunc cursus bibendum. Nam euismod augue sit amet mi sagittis rutrum. Duis blandit fringilla augue, vel semper tellus convallis non. Quisque scelerisque quis justo in faucibus. Maecenas lacinia odio ac mattis aliquet. Curabitur eget risus metus. In tortor risus, sagittis a leo eu, sollicitudin commodo mauris. Ut mattis nunc scelerisque sem bibendum fringilla.  Phasellus vitae est mattis, vestibulum tellus quis, vulputate purus. Curabitur et blandit arcu. Pellentesque ultrices orci et urna efficitur, eget malesuada purus posuere. Vestibulum blandit ex a elit finibus iaculis eget nec magna. Aenean vel tempor sapien. Aliquam iaculis felis quis purus sodales iaculis id vitae arcu. Curabitur rhoncus mollis dapibus. Donec porta velit vel neque semper consequat. Sed semper eget tellus at tempus. Aliquam ultricies urna a arcu consectetur tempus. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec interdum, lectus bibendum malesuada sodales, libero felis dignissim augue, nec pellentesque justo enim nec urna.  Cras nibh mauris, lacinia ut imperdiet et, sollicitudin quis eros. Vivamus in dui ac leo venenatis rhoncus. Donec mi purus, elementum non nisl ac, dapibus porttitor felis. Donec semper neque ornare lacinia dignissim. Phasellus a suscipit tellus, id finibus sapien. Sed vel interdum elit. Praesent vel ligula non enim sagittis gravida.  Cras ut arcu sit amet neque rhoncus rhoncus. Vivamus libero orci, viverra at tincidunt sed, mattis nec urna. Nunc in vestibulum velit. Praesent interdum id est quis euismod. Praesent non eros lacinia augue auctor molestie rutrum ac odio. Nulla venenatis dui a turpis vestibulum euismod. Aliquam sed tincidunt odio. Maecenas dapibus efficitur mauris, ac fringilla purus convallis quis. Donec sit amet elit sit amet justo ullamcorper lacinia quis eget magna. Nunc consectetur aliquam ultricies. Fusce varius ex quis suscipit laoreet. Mauris non urna pulvinar, rutrum mauris malesuada, hendrerit magna. Fusce in tellus molestie, condimentum dolor vel, blandit ipsum. Integer mollis quam quam. Curabitur dictum nisl eros, vel eleifend justo lobortis non.");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, procedureTextArea, org.jdesktop.beansbinding.ELProperty.create("${text_ON_FOCUS_LOST}"), procedureTextArea, org.jdesktop.beansbinding.BeanProperty.create("wrapStyleWord"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(procedureTextArea);
        procedureTextArea.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 359, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Avalon", 0, 11)); // NOI18N
        jLabel5.setText("SERVING SIZE: Good for");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(375, 300));
        jPanel5.setPreferredSize(new java.awt.Dimension(375, 300));

        jLabel4.setFont(new java.awt.Font("Avalon", 1, 14)); // NOI18N
        jLabel4.setText("Ingredients");

        ingredientsTextArea.setColumns(20);
        ingredientsTextArea.setRows(5);
        ingredientsTextArea.setText("ENTER INGREDIENTS HERE");
        ingredientsTextArea.setMaximumSize(new java.awt.Dimension(250, 350));
        jScrollPane1.setViewportView(ingredientsTextArea);
        ingredientsTextArea.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(recipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search a recipe here:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuButton)))
                .addGap(22, 22, 22))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton)
                            .addComponent(menuButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        searchField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                searchField.setText("");
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        searchFor(searchField.getText());
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchFor(searchField.getText());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        jPopupMenu1.show(this, menuButton.getX(), menuButton.getY());
        jPopupMenu1.setVisible(true);
    }//GEN-LAST:event_menuButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RecipeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ingredientsTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private ImageIcon imageIcon;
    private Image image;
    private Image newimg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton menuButton;
    private javax.swing.JTextArea procedureTextArea;
    private javax.swing.JLabel recipeTitle;
    private String foodName= "";
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables


    //////////////--------------Other User Methods------------------////////////////
    public void searchFor(String query){
        searchField.setText(query);//to show in search bar the search
        //Checking of Connection.
        try (Connection con=GUIMgr.connectSQL()) {//try with resources
            if (!GUIMgr.isSQLConnected(con)) {
                System.out.println("connection failed");
                return;
            }
            
            Statement stat = con.createStatement();
            //Selecting the Recipe
            ResultSet result = null;
            //Displaying the Recipe.
            String recipeType = "N/A";
            String servingSize = "";
            String ingredients = "";
            String steps = "";
            try {
                result = stat.executeQuery("Select * From MainIndex Where "
                        + "`Recipe Title` = \'" + query + "\'");
                while (result.next()) {
                    query = result.getString(1);
                    recipeType = result.getString(2);
                    servingSize = result.getString(3);
                    ingredients = result.getString(4);
                    steps = result.getString(5);
                }
            } catch (SQLException sqle){}
            
            
            recipeTitle.setText(query);

            try {
                ResultSet ingredientsBreakdown = stat.executeQuery("Select * from "
                        + ingredients);
                ingredientsTextArea.setText("");
                ingredientsTextArea.setLineWrap(true);
                while (ingredientsBreakdown.next()) {
                    ingredientsTextArea.setText(ingredientsTextArea.getText()+"\n"
                            +ingredientsBreakdown.getString(3) + "\t"
                            + ingredientsBreakdown.getString(2) + "\t"
                            + ingredientsBreakdown.getString(1));
                }
                ingredientsTextArea.setWrapStyleWord(true);
            } catch (SQLException sqle2){
                ingredientsTextArea.setText("Ingredient Data Not Found.");
            }
            

            try {
                ResultSet stepsBreakdoawn = stat.executeQuery("Select * from "
                        + steps);
                procedureTextArea.setText("");
                procedureTextArea.setLineWrap(true);
                procedureTextArea.setWrapStyleWord(true);
                while (stepsBreakdoawn.next()) {
                    procedureTextArea.setText(procedureTextArea.getText()+"\n"
                            +stepsBreakdoawn.getInt(1) + "\t"
                            + stepsBreakdoawn.getString(2));
                }
//                procedureTextArea.setWrapStyleWord(true);
            } catch (SQLException sqle3){
                procedureTextArea.setText("Procedure Data Not Found.");
            }
        } catch (Exception e) {
            System.out.println("Did Not connect to DB - Error: " + e);
            e.printStackTrace();
        }

    }


}
