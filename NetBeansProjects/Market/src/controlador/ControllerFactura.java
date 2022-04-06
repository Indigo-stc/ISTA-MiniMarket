package controlador;

//package controlador;
//
//import java.awt.Image;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.io.File;
//import java.sql.Date;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableCellRenderer;
//import javax.swing.table.DefaultTableModel;
//import modelo.Comprobante;
//import modelo.Conexion;
//import modelo.Encabezado;
//import modelo.IProductoDAO;
//import modelo.ModeloEmpleado;
//import modelo.Modelo_Encabezado;
//import modelo.Modelo_Factura;
//import modelo.Producto;
//import modelo.ProductoDAO;
//import vista.Facturaa;
//
//
//public class ControllerFactura {
//
//    public ModeloEmpleado modelEmp;
//    public IProductoDAO modelPro;
//    public Modelo_Factura modelFact;
//    public Modelo_Encabezado modelEnca;
//    public Facturaa vistaFact;
//    
//
//    public ControllerFactura(ModeloEmpleado modelEmp, IProductoDAO modelPro, Modelo_Factura modelFact, Modelo_Encabezado modelEnca, Facturaa vistaFact) {
//        this.modelEmp = modelEmp;
//        this.modelPro = modelPro;
//        this.modelFact = modelFact;
//        this.modelEnca = modelEnca;
//        this.vistaFact = vistaFact;
//    }
//    
//    
//    
//    //List de los productos a comprar  Btn Agregar(Almacenar)
//    List<Producto> dprods = new ArrayList<>();
//
//    //Alcenar datos a guardar en la base
//    List<Comprobante> listamdfact = new ArrayList<>();
//
//    //boton
//    public void InicializarBotones() {
//        KeyListener kl = new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                cargarImagen(vistaFact.getTxt_buscar().getText());
//                cargarPersonasDialogo(vistaFact.getTxtBuscarPersoD().getText());
//            }
//        };
//
//        vistaFact.getPro1().addActionListener(l -> DatosImagen(vistaFact.getPro1().getName()));
//        vistaFact.getPro2().addActionListener(l -> DatosImagen(vistaFact.getPro2().getName()));
//
//        vistaFact.getPro3().addActionListener(l -> DatosImagen(vistaFact.getPro3().getName()));
//        vistaFact.getPro4().addActionListener(l -> DatosImagen(vistaFact.getPro4().getName()));
//
//        vistaFact.getPro5().addActionListener(l -> DatosImagen(vistaFact.getPro5().getName()));
//        vistaFact.getPro6().addActionListener(l -> DatosImagen(vistaFact.getPro6().getName()));
//
//        vistaFact.getPro7().addActionListener(l -> DatosImagen(vistaFact.getPro7().getName()));
//        vistaFact.getPro8().addActionListener(l -> DatosImagen(vistaFact.getPro8().getName()));
//
//        //Agregar un producto a la tabla
//        vistaFact.getBtn_agregar().addActionListener(l -> datosTabla());
//
//        //DIALOGO Productod
////     
//        //DIALOGO Personas
//        vistaFact.getTxt_buscar().addActionListener(l -> llenarDatosPersona());
//        vistaFact.getBtnAgregarPersoD().addActionListener(l -> seleccionCliente());
//
//        //Cancelar Factura
//        vistaFact.getBtn_quitar().addActionListener(l -> Cancelar());
//
//        //Btn Quitar
//        vistaFact.getBtn_cancelar().addActionListener(l -> seleccionRQuitar());
////        vistaVn.getBtnImprimir().addActionListener(l -> Imprimir());
////boton imprimir
//        vistaFact.getBtn_imprimir().addActionListener(l -> imprimirClientes());
//        //consumidor final
//        vistaFact.getBtnConsumidorF().addActionListener(l -> consumidorfinal());
//        //Guardar Factura
//        vistaFact.getBtn_guardar().addActionListener(l -> GuardarFactura());
//        vistaFact.getTxt_buscar().addKeyListener(kl);
//        vistaFact.getTxtBuscarPersoD().addKeyListener(kl);
//        LocalDate l = LocalDate.now();
//        vistaFact.getLblfechaV().setText(l.toString());
//        vistaFact.getLblnumfacV().setText((modelFact.idFactura() + 1) + "");
//
//    }
//
////dialos personas
//    public void abrirDialogoPersonas() {
//        vistaFact.getDlgPersona().setLocationRelativeTo(vistaFact);
//        vistaFact.getDlgPersona().setSize(650, 397);
//        vistaFact.getDlgPersona().setVisible(true);
//        cargarPersonasDialogo("");
//    }
//
//    public void seleccionCliente() {
//        DefaultTableModel tblPersonas = (DefaultTableModel) vistaFact.getTblPersonas2().getModel();
//        int fila = vistaFact.getTblPersonas2().getSelectedRow();
//        if (fila != -1) {
//            String idPersona = tblPersonas.getValueAt(fila, 0).toString();
//            cargadePersonaVentas(idPersona);
//            vistaFact.getDlgPersona().setVisible(false);
//        } else {
//            JOptionPane.showMessageDialog(vistaFact, "Seleccione el Cliente", "AVISO", 2);
//        }
//    }
//
//    public void seleccionRQuitar() {
//        DefaultTableModel tblventas = (DefaultTableModel) vistaFact.getTbl_factura().getModel();
//        int fila = vistaFact.getTbl_factura().getSelectedRow();
//        if (fila != -1) {
//            String idpro = tblventas.getValueAt(fila, 0).toString();
//            for (int i = 0; i < dprods.size(); i++) {
//                Producto prod = dprods.get(i);
//                if (idpro.equalsIgnoreCase(prod.getProducto_id() + "")) {
//                    dprods.remove(i);
//                    llenartabla();
//                }
//            }
//
//            for (int i = 0; i < listamdfact.size(); i++) {
//                Comprobante detalle = listamdfact.get(i);
//                if (idpro.equalsIgnoreCase(detalle.getProductoID() + "")) {
//                    listamdfact.remove(i);
//                }
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(vistaFact, "Seleccione el producto a quitar");
//        }
//    }
//
//    public void cargarPersonasDialogo(String id) {
//        vistaFact.getTblPersonas2().setDefaultRenderer(Object.class, new ImagenTabla());//La manera de renderizar la tabla.
//        vistaFact.getTblPersonas2().setRowHeight(100);
//
//        //enlazar el modelo de a tabla con mi controlador 
//        DefaultTableModel tblModel;
//        tblModel = (DefaultTableModel) vistaFact.getTblPersonas2().getModel();
//        tblModel.setNumRows(0); // limpio las filas de la tabla
//        ModelPersona nmp = new ModelPersona();
//        List<Persona> listap = nmp.listarPersonas(id); // enlazo al modelo y obtengo los datos
//        Holder<Integer> i = new Holder<>(0);//contador para el no. fila
//
//        listap.stream().forEach(pe -> {
//
//            tblModel.addRow(new Object[8]);//Creo una fila vacia/
//            vistaFact.getTblPersonas2().setValueAt(pe.getIdPersona(), i.value, 0);
//            vistaFact.getTblPersonas2().setValueAt(pe.getNombres(), i.value, 1);
//            vistaFact.getTblPersonas2().setValueAt(pe.getApellidos(), i.value, 2);
//            vistaFact.getTblPersonas2().setValueAt(pe.getTelefono(), i.value, 3);
//            vistaFact.getTblPersonas2().setValueAt(pe.getSexo(), i.value, 4);
//            Image foto = pe.getFoto();
//            if (foto != null) {
//
//                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
//                ImageIcon icono = new ImageIcon(nimg);
//                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
//                renderer.setIcon(icono);
//                vistaFact.getTblPersonas2().setValueAt(new JLabel(icono), i.value, 5);
//            } else {
//                vistaFact.getTblPersonas2().setValueAt(null, i.value, 5);
//            }
//
//            i.value++;
//
//        });
//    }
//
//    public void llenarDatosPersona() {
//        if (vistaFact.getTxt_cedula().getText().isEmpty()) {
//            abrirDialogoPersonas();
//        } else {
//            cargadePersonaVentas(vistaFact.getTxt_cedula().getText());
//
//        }
//    }
//
//    //Cuando se llena el campo cedula
//    public void cargadePersonaVentas(String bsqda) {
//        System.out.println("cargadePersonaVentas");
//        System.out.println(bsqda);
//        ModelPersona nmpersona = new ModelPersona();
//
//        List<Persona> listap = nmpersona.buscarPersonas(bsqda);
//        for (int i = 0; i < listap.size(); i++) {
//            Persona pe = listap.get(i);
//            vistaFact.getTxtCedulaV().setText(pe.getIdPersona());
//            vistaFact.getLblnombresV().setText(pe.getNombres());
//            vistaFact.getLblapellidosV().setText(pe.getApellidos());
//            vistaFact.getLbltelefonoV().setText(pe.getTelefono());
//            Image foto = pe.getFoto();
//            if (foto != null) {
//                Image nimg = foto.getScaledInstance(125, 130, Image.SCALE_SMOOTH);
//                ImageIcon icono = new ImageIcon(nimg);
//                vistaFact.getLblFotoC().setIcon(icono);
//            } else {
//                vistaFact.getLblFotoC().setIcon(null);
//            }
//        }
//
//    }
//
//    // cargar imagen ***************
//    public void cargarImagen(String busqueda) {
//        //enlazar el modelo de a tabla con mi controlador 
//        vistaFact.getPro1().setIcon(null);
//        vistaFact.getPro2().setIcon(null);
//        vistaFact.getPro3().setIcon(null);
//        vistaFact.getPro4().setIcon(null);
//        vistaFact.getPro5().setIcon(null);
//        vistaFact.getPro6().setIcon(null);
//        vistaFact.getPro7().setIcon(null);
//        vistaFact.getPro8().setIcon(null);
//        vistaFact.getPro1().setText("");
//        vistaFact.getPro2().setText("");
//        vistaFact.getPro3().setText("");
//        vistaFact.getPro4().setText("");
//        vistaFact.getPro5().setText("");
//        vistaFact.getPro6().setText("");
//        vistaFact.getPro7().setText("");
//        vistaFact.getPro8().setText("");
//
//        List<Producto> listap = modelPro.listarProductos(busqueda); // enlazo al modelo y obtengo los datos
//        int cont = listap.size();
//
//        for (int i = 0; i < listap.size(); i++) {
//            Productos ge = listap.get(i);
//            Image foto = ge.getFoto();
//            if (foto != null) {
//                Image nimg = foto.getScaledInstance(89, 86, Image.SCALE_SMOOTH);
//
//                ImageIcon icono = new ImageIcon(nimg);
//
//                if (cont == 1) {
//                    vistaFact.getPro1().setIcon(icono);
//                    vistaFact.getPro1().setName(ge.getId() + "");
//                    cont--;
//                }
//                if (cont == 2) {
//                    vistaFact.getPro2().setIcon(icono);
//                    vistaFact.getPro2().setName(ge.getId() + "");
//                    cont--;
//                }
//                if (cont == 3) {
//                    vistaFact.getPro3().setIcon(icono);
//                    vistaFact.getPro3().setName(ge.getId() + "");
//                    cont--;
//                }
//                if (cont == 4) {
//                    vistaFact.getPro4().setIcon(icono);
//                    vistaFact.getPro4().setName(ge.getId() + "");
//                    cont--;
//                }
//                if (cont == 5) {
//                    vistaFact.getPro5().setIcon(icono);
//                    vistaFact.getPro5().setName(ge.getId() + "");
//                    cont--;
//                }
//                if (cont == 6) {
//                    vistaFact.getPro6().setIcon(icono);
//                    vistaFact.getPro6().setName(ge.getId() + "");
//                    cont--;
//                }
//                if (cont == 7) {
//                    vistaFact.getPro7().setIcon(icono);
//                    vistaFact.getPro7().setName(ge.getId() + "");
//                    cont--;
//                }
//                if (cont == 8) {
//                    vistaFact.getPro8().setIcon(icono);
//                    vistaFact.getPro8().setName(ge.getId() + "");
//                    cont--;
//                }
//                if (cont > 8) {
//                    cont--;
//                }
//            }
//
//        }
//
//        listap.stream().forEach(pe -> {
//
//            Image foto = pe.getImagen();
//            if (foto != null) {
//
//                Image nimg = foto.getScaledInstance(89, 86, Image.SCALE_SMOOTH);
//                ImageIcon icono = new ImageIcon(nimg);
//            }
//        });
//    }
//
//    //Mostrar Datos en los label ********
//    public void DatosImagen(String id) {
//        if (!id.isEmpty()) {
//            List<Producto> product = (List<Producto>) modelPro.buscar(id);
//            product.stream().forEach(pe -> {
//                vistaFact.getTxt_idproducto().setText(pe.getProducto_id()+ "");
//                vistaFact.getTxt_producto().setText(pe.getNombre());
//                vistaFact.getTxt_precio().setText(pe.getPrecio() + "");
//            });
//        }
//    }
//
//    ///CLick Btn Agregar
//    public void datosTabla() {
//        if (!vistaFact.getTxt_idproducto().getText().isEmpty()) {
//            if (!vistaFact.getTxt_producto().getText().isEmpty()) {
//                if ((int) vistaFact.getSpinnetcant().getValue() > 0) {
//                    if (vistaFact.getCantidadProductos().getText().isEmpty()) {
//                        vistaFact.getCantidadProductos().setText(modelEnca.getCodigoEncabezado() + "");
//                    }
//                    String idEncabezado = vistaFact.getCantidadProductos().getText() + 1;
//                    vistaFact.getCantidadProductos().setText(idEncabezado + "");
//                    String idprod = vistaFact.getTxt_idproducto().getText();
//                    String nomprod = vistaFact.getTxt_producto().getText();
//                    Double precio = Double.parseDouble(vistaFact.getTxt_precio().getText());
//                    String idfactura = vistaFact.getLblnumfacV().getText();
//                    int cant = (int) vistaFact.getSpinnetcant().getValue();
//                    precio = precio * cant;
//                    int cantidaBase = 0;
//                    IProductoDAO  mp = new IProductoDAO ();
//                    List<Producto> lp = (List<Producto>) mp.buscar(idprod + "");
//
//                    for (int j = 0; j < lp.size(); j++) {
//                        Producto get = lp.get(j);
//                        cantidaBase = get.getStock();
//                    }
//
//                    System.out.println("");
//
//                    if (cantidaBase >= cant) {
//                        Comprobante mComp = new Comprobante();
//                        mComp.setCodigoEncabezado(idEncabezado);
//                        mComp.setIdComprobante(idfactura);
//                        mComp.setProductoID(idprod);
//                        mComp.setCantidadProducto(cant);
//                        mComp.setPrecio(precio);
//                        listamdfact.add(mComp);
//
//                        for (int i = 0; i < listamdfact.size(); i++) {
//                            Comprobante df = listamdfact.get(i);
//                            System.out.println(df.getIdComprobante() + " " + df.getProductoID() + " " + df.getCantidadProducto() + " " + df.getPrecio());
//                        }
//
//                        Producto np = new modelPro();
//                        np.setId(idprod);
//                        np.setNombre(nomprod);
//                        np.setCantidad(cant);                       
//                        np.setPrecio(precio);
//                        np.setProductoID(idprod);
//                        np.setCantidadProducto(cant);
//                        np.setPrecio(precio);
//
//                        dprods.add(np);
//                        llenartabla();
//                    } else {
//                        JOptionPane.showMessageDialog(vistaFact, "No existe esa cantidad del producto selecionado");
//                    }
//
//                } else {
//                    JOptionPane.showMessageDialog(vistaFact, "Ingrese la cantidad mayor a cero(0)");
//                }
//
//            } else {
//                JOptionPane.showMessageDialog(vistaFact, "Seleccione un articulo");
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(vistaFact, "Se debe seleccionar un cliente");
//        }
//
//    }
//
//    public void llenartabla() {
//        DefaultTableModel tblModel;
//        tblModel = (DefaultTableModel) vistaFact.getTablaVentas().getModel();
//        tblModel.setNumRows(0); // limpio las filas de la tabla
//        Double sum = 0.0;
//        System.out.println("Llenar tabla " + dprods.size());
//        dprods.stream().forEach(p1 -> {
//            String[] prod = {p1.getId() + "", p1.getNombre(), p1.getCantidad() + "", p1.getPrecio() + ""};
//            tblModel.addRow(prod);
//        });
//        for (int i = 0; i < dprods.size(); i++) {
//            Productos pr = dprods.get(i);
//            sum = sum + pr.getPrecio();
//            vistaFact.getTxtSubTotal().setText(sum + "");
//        }
//        if (dprods.isEmpty()) {
//            vistaFact.getTxtSubTotal().setText("0.0");
//        }
//        Double iva = sum * 0.12;
//        vistaFact.getTxtIva().setText(iva + "");
//        vistaFact.getTxtTotal().setText((sum + iva) + "");
//
//        limpiarlbl();
//    }
//
//    public void limpiarlbl() {
//        vistaFact.getLblidprodV().setText("");
//        vistaFact.getLblnomprodV().setText("");
//        vistaFact.getLblprecioprodV().setText("");
//        vistaFact.getSpinercantprodV().setValue(0);
//    }
//
//    public void GuardarFactura() {
//        if (!vistaFact.getLblnombresV().getText().isEmpty()) {
//            String idfactura = (mfactura.idFactura() + 1) + "";
//            Date fecha = Date.valueOf(vistaVn.getLblfechaV().getText());
//            String cedula = vistaFact.getTxtCedulaV().getText();
//            int cantBase = 0;
//            String nom = "";
//            Double precio = 0.0;
//            int cantidad = 0;
//            Image foto = null;
//            Double total = Double.parseDouble(vistaFact.getTxtTotal().getText());
//            ModelFactura nfactura = new ModelFactura(idfactura, fecha, total, cedula);
//            if (nfactura.crearFactura()) {
//                for (int i = 0; i < listamdfact.size(); i++) {
//                    Detalle_Factura df = listamdfact.get(i);
//                    ModelDetalle_Factura ndf = new ModelDetalle_Factura(df.getId_detallef(), df.getId_factura(), df.getId_producto(), df.getCantidad(), df.getPrecio(), total);
//                    ModelProducto ediCant = new ModelProducto();
//                    List<Productos> lp = ediCant.buscarProductos(df.getId_producto() + "");
//
//                    for (int j = 0; j < lp.size(); j++) {
//                        Productos get = lp.get(j);
//                        cantBase = get.getCantidad();
//                        nom = get.getNombre();
//                        precio = get.getPrecio();
//                        cantidad = get.getCantidad();
//                        foto = get.getFoto();
//
//                    }
//                    System.out.println("Cantida Base " + cantBase);
//                    int cantRest = cantBase - df.getCantidad();
//                    ediCant.setCantidad(cantRest);
//                    ediCant.setId(df.getId_producto());
//
//                    System.out.println(df.getId_producto() + " " + nom + " " + cantRest);
//                    if (ediCant.editarCantproductos()) {
//                        System.out.println("Cantidas editado");
//                        System.out.println("Nueva Cant " + ediCant.getCantidad());
//                    } else {
//                    }
//                    if (ndf.crearDetalleFactura()) {
//
//                    } else {
//                        System.out.println("Error al crear el detalle");
//                    }
//                }
//                JOptionPane.showMessageDialog(vistaFact, "Factura Creada", "Successful", JOptionPane.INFORMATION_MESSAGE);
//            } else {
//                System.out.println("Error al crear el encabezado de la factura");
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(vistaFact, "Llenar los datos necesarios");
//        }
//    }
//
//    public void Cancelar() {
//        int i = 0;
//        while (i < dprods.size()) {
//            for (int j = 0; j < dprods.size(); j++) {
//                listamdfact.remove(j);
//                dprods.remove(j);
//
//            };
//            i++;
//        }
//
//        int k = 0;
//        while (k < dprods.size()) {
//            for (int j = 0; j < dprods.size(); j++) {
//                listamdfact.remove(j);
//                dprods.remove(j);
//
//            };
//            k++;
//        }
//        if (dprods.isEmpty()) {
//            System.out.println("2");
//            System.out.println("Detalle Guardar " + listamdfact.size());
//            System.out.println("Detalle tabla " + dprods.size());
//            vistaFact.getTxtCedulaV().setText("");
//            vistaFact.getLblnombresV().setText("");
//            vistaFact.getLblapellidosV().setText("");
//            vistaFact.getLbltelefonoV().setText("");
//            vistaFact.getLblFotoC().setIcon(null);
//            vistaFact.getTxtSubTotal().setText("");
//            vistaFact.getTxtIva().setText("");
//            vistaFact.getTxtTotal().setText("");
//            llenartabla();
//        }
//    }
//
////    public void Imprimir() {
////        int resultado = JOptionPane.showConfirmDialog(vistaVn, "Esta seguro de imprimir", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
////        if (resultado == JOptionPane.YES_NO_OPTION) {
////            JOptionPane.showMessageDialog(vistaVn, "La factura se ha impreso correctsmente");
////        } else {
////            JOptionPane.showMessageDialog(vistaVn, "Proceso cancelado");
////        }
////    }
//    public void consumidorfinal() {
//        String id = "0000";
//        ModelPersona mp = new ModelPersona();
//        List<Persona> listanp = mp.buscarPersonas(id);
//        if (listanp.isEmpty()) {
//            ModelPersona cf = new ModelPersona(id, "Consumidor Final", "XXXXXXXX", null, "XXXXXXXX", "XXXXXXXX");
//            if (cf.crearPersonafinal()) {
//                System.out.println("Consumidor final creado");
//                cargadePersonaVentas(id);
//            } else {
//                System.out.println("Error al crear el consumidor final");
//            }
//        } else {
//            cargadePersonaVentas(id);
//            System.out.println("Ya existe un consumidor final");
//        }
//
//    }
//
//    private void imprimirClientes() {
//        Conexion connection = new Conexion();
//        try {
//            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/View/reportes/ReporteDlFactura.jasper"));
//            Map<String, Object> parametros = new HashMap<String, Object>();
//            parametros.put("LimitePrecioSup", 35);
//            parametros.put("LimiteTotalSpr", 50);
//            parametros.put("TituloPril", "Reporte de Factura");
//             parametros.put("LogoF", "MALY.png");
//
//            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, connection.getCon());//cargando el reporte con los datos BD
//
//            JasperViewer jv = new JasperViewer(jp,false);
//
//            jv.setVisible(true);
//        } catch (JRException ex) {
//            Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//   
//   
//}
