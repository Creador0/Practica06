package mx.edu.labpoo.ordinario.vistas;
public class Ventana extends JFrame{ //hereda de JFrame (A)
    Acciones acc;
    
    public Ventana() {
        initComponents();
		Acciones acc = new Acciones();
        //crear una nueva instancia de acc (Acciones) (B)
    }

    private void initComponents() {
        lblLados = new javax.swing.JLabel();
        txtLados = new javax.swing.JTextField();
        lblLad1 = new javax.swing.JLabel();
        lblLad2 = new javax.swing.JLabel();
        lblLad3 = new javax.swing.JLabel();
        lblLad4 = new javax.swing.JLabel();
        txtLad1 = new javax.swing.JTextField();
        txtLad2 = new javax.swing.JTextField();
        txtLad3 = new javax.swing.JTextField();
        txtLad4 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFiguras = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnuSave = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();

        //establecer el cierre del JFrame al presionar la X de la ventana (C)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblLados.setText("Número de Lados:");

        txtLados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLadosFocusLost(evt);
            }
        });

        lblLad1.setText("Lado 1 (Base):");

        lblLad2.setText("Lado 2 (Altura):");

        lblLad3.setText("Lado 3:");

        lblLad4.setText("Lado 4:");

        btnAdd.setText("Agregar");
		btnAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btnAdd.setEnabled(false);
			}
		});
        //btnAdd - agregar el ActionListener para mandar llamar al método 
        //btnAddActionPerformed(evt) (D)

        txtFiguras.setEditable(false);
        txtFiguras.setColumns(20);
        txtFiguras.setRows(5);
        jScrollPane1.setViewportView(txtFiguras);

        jMenu.setText("Archivo");

        mnuSave.setText("Guardar datos");
        //mnuSave - agregar el ActionListener para mandar llamar al método 
        //mnuSaveActionPerformed(evt) (E)
			mnuSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jMenu.add(mnuSave);
			}
		});
		
        mnuExit.setText("Salir");
        //mnuExit - agregar el ActionListener para mandar llamar al método
        //mnuExitActionPerformed(evt) (F)
			mnuExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jMenu.add(mnuExit);
			}
		});

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblLad1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLad1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblLados))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLad2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLad2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLad3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLad3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLad4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLad4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLados, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(409, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLados)
                    .addComponent(txtLados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLad1)
                            .addComponent(txtLad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLad2)
                            .addComponent(txtLad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLad3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLad4))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }

    private void txtLadosFocusLost(java.awt.event.FocusEvent evt) {
        acc.chkLados();
    }

    private void mnuSaveActionPerformed(java.awt.event.ActionEvent evt) {
        acc.saveFile();
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        acc.addFigura();
    }

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    public JTextArea getTxtFiguras() {
        return txtFiguras;
    }

    public JTextField getTxtLad1() {
        return txtLad1;
    }

    public JTextField getTxtLad2() {
        return txtLad2;
    }

    public JTextField getTxtLad3() {
        return txtLad3;
    }

    public JTextField getTxtLad4() {
        return txtLad4;
    }

    public JTextField getTxtLados() {
        return txtLados;
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    private javax.swing.JButton btnAdd;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLad1;
    private javax.swing.JLabel lblLad2;
    private javax.swing.JLabel lblLad3;
    private javax.swing.JLabel lblLad4;
    private javax.swing.JLabel lblLados;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuSave;
    private javax.swing.JTextArea txtFiguras;
    private javax.swing.JTextField txtLad1;
    private javax.swing.JTextField txtLad2;
    private javax.swing.JTextField txtLad3;
    private javax.swing.JTextField txtLad4;
    private javax.swing.JTextField txtLados;
}
