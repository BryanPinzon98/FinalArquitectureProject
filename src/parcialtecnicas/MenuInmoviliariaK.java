package parcialtecnicas;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInmoviliariaK {

    Scanner sc = new Scanner(System.in);
    private ArrayList<Inmueble> listaInmuebles = new ArrayList<>();
    private int contadorOficinas = 0;
    private int contadorCasas = 0;
    private int contadorApartamentos = 0;
    private double contadorDineroRecaudado = 0;
    private double contadorImpuesto = 0;
    private int contadorDineroRecaudadoMasImpuestos = 0;

    public static void main(String[] args) {
        MenuInmoviliariaK menu = new MenuInmoviliariaK();
        menu.desplegarMenu();
    }

    private void desplegarMenu() {
        System.out.print(" ");
        System.out.println(" ");
        System.out.println("--- Inmoviliaria Konrad Menu ---");
        System.out.println("Ingrese una opcion:");
        System.out.println("1. Agregar inmueble.");
        System.out.println("2. Mostrar inmuebles disponibles.");
        System.out.println("3. Vender Inmueble.");
        System.out.println("4. Dar total recaudado por ventas netas.");
        System.out.println("5. Dar impuestos pagados.");
        System.out.println("6. Dar total recaudes despues de impuestos.");
        System.out.println("7. Salir.");
        System.out.print("Opcion: ");
        Scanner scanner = new Scanner(System.in);
        String opcionSeleccionada = scanner.nextLine();
        switch (opcionSeleccionada) {
            case "1":
                agregarInmueble();
                break;
            case "2":
                mostrarInmueblesDisponibles();
                break;
            case "3":
                venderInmueble();
                break;
            case "4":
                darRecaudoNeto();
                break;
            case "5":
                darImpuestosPagados();
                break;
            case "6":
                darRecaudosDespuesDeImpuestos();
                break;
            case "7":
                System.exit(0);
                break;
        }
        desplegarMenu();

    }

    private void agregarInmueble() {

        System.out.println("Que tipo de inmueble desea ingresar? \n 1.Oficina. \n 2.Vivienda Casa. \n 3.Vivienda Apartamento. \n 4.Regresar al menú. ");
        System.out.print("Opcion: ");
        String opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("Ingrese los datos de su Oficina. El modelo a seguir es: Id (int)- Tipo (int) - Metros cuadrados construidos (int) - Estrato (int) - Valor base metro cuadrado (int) - Parqueadero Visitante (Boolean). ");
                System.out.println("Asegurese de no ingresar un dato numérico en el campo Parqueadero Visitante. ");
                String linea = sc.nextLine();

                String[] vectorLinea = linea.split("-");

                int idOficina = Integer.parseInt(vectorLinea[0]);
                int tipoOficina = Integer.parseInt(vectorLinea[1]);
                int metrosCuadradosConstruidosOficina = Integer.parseInt(vectorLinea[2]);
                int estratoOficina = Integer.parseInt(vectorLinea[3]);
                int valorBaseMetroCuadradoOficina = Integer.parseInt(vectorLinea[4]);
                boolean parqueaderoVisitanteOficina = Boolean.parseBoolean(vectorLinea[5]);

                if (vectorLinea.length == 6 && tipoOficina == 1) {
                    listaInmuebles.add(new Oficina(idOficina, tipoOficina, metrosCuadradosConstruidosOficina, estratoOficina, valorBaseMetroCuadradoOficina, parqueaderoVisitanteOficina));
                    System.err.println("Felicidades! Ahora tiene: " + listaInmuebles.size() + " inmuebles.");
                    contadorOficinas++;
                } else {
                    System.err.println("Error. Ingresó más información de la permitida o el tipo de inmueble no corresponde al de Oficina. Verifique el modelo de datos a ingresar.");
                }

                break;

            case "2":
                System.out.println("Ingrese los datos de su Casa: El modelo a seguir es: Id (int)- Tipo (int) - Metros cuadrados construidos (int) - Estrato (int) - Valor base metro cuadrado (int) - Número Parqueaderos (Int) - Vigilancia Privada (Boolean). ");
                System.out.println("Asegurese de no ingresar un dato numérico en el campo Vigilancia privada. ");
                String lineaCasa = sc.nextLine();

                String[] vectorLineaCasa = lineaCasa.split("-");

                int idCasa = Integer.parseInt(vectorLineaCasa[0]);
                int tipoCasa = Integer.parseInt(vectorLineaCasa[1]);
                int metrosCuadradosConstruidosCasa = Integer.parseInt(vectorLineaCasa[2]);
                int estratoCasa = Integer.parseInt(vectorLineaCasa[3]);
                int valorBaseMetroCuadradoCasa = Integer.parseInt(vectorLineaCasa[4]);
                int numeroParqueaderosCasa = Integer.parseInt(vectorLineaCasa[5]);
                boolean vigilanciaPrivadaCasa = Boolean.parseBoolean(vectorLineaCasa[6]);

                if (vectorLineaCasa.length == 7 && tipoCasa == 2) {
                    listaInmuebles.add(new ViviendaCasa(idCasa, tipoCasa, metrosCuadradosConstruidosCasa, estratoCasa, valorBaseMetroCuadradoCasa, numeroParqueaderosCasa, vigilanciaPrivadaCasa));
                    System.err.println("Felicidades! Ahora tiene: " + listaInmuebles.size() + " inmuebles.");
                    contadorCasas++;
                } else {
                    System.err.println("Error. Ingresó más información de la permitida o el tipo de inmueble no corresponde al de Vivienda Casa. Verifique el modelo de datos a ingresar.");
                }

                break;

            case "3":

                System.out.println("Ingrese los datos de su Apartamento: El modelo a seguir es: Id (int)- Tipo (int) - Metros cuadrados construidos (int) - Estrato (int) - Valor base metro cuadrado (int) - Número Parqueaderos (Int) - Vigilancia Privada (Boolean).");
                String lineaApartamento = sc.nextLine();

                String[] vectorLineaApartamento = lineaApartamento.split("-");

                int idApartamento = Integer.parseInt(vectorLineaApartamento[0]);
                int tipoApartamento = Integer.parseInt(vectorLineaApartamento[1]);
                int metrosCuadradosConstruidosApartamento = Integer.parseInt(vectorLineaApartamento[2]);
                int estratoApartamento = Integer.parseInt(vectorLineaApartamento[3]);
                int valorBaseMetroCuadradoApartamento = Integer.parseInt(vectorLineaApartamento[4]);
                int numeroParqueaderosApartamento = Integer.parseInt(vectorLineaApartamento[5]);
                int pisoApartamento = Integer.parseInt(vectorLineaApartamento[6]);

                if (vectorLineaApartamento.length == 7 && tipoApartamento == 3 && pisoApartamento > 0) {
                    listaInmuebles.add(new ViviendaApartamento(idApartamento, tipoApartamento, metrosCuadradosConstruidosApartamento, estratoApartamento, valorBaseMetroCuadradoApartamento, numeroParqueaderosApartamento, pisoApartamento));
                    System.err.println("Felicidades! Ahora tiene: " + listaInmuebles.size() + " Inmuebles.");
                    contadorApartamentos++;

                } else if (vectorLineaApartamento.length == 7 && pisoApartamento == 0) {
                    System.err.println("¿Tiene cero pisos? Información incorrecta.");
                } else {
                    System.err.println("Error. Ingresó más información de la permitida. Verifique el modelo de datos a ingresar.");
                }

                break;

            case "4":
                desplegarMenu();

            default:
                System.err.println("Opción no válida.");
                agregarInmueble();
                break;
        }

    }

    private void mostrarInmueblesDisponibles() {
        System.out.println("Qué tipo de inmueble desea consultar: \n 1. Oficina. \n 2. Vivienda Casa. \n 3. Vivienda Apartamento. \n 4.Regresar al menú. ");
        System.out.print("Opcion: ");
        int opcionConsulta = sc.nextInt();

        if (opcionConsulta == 1) {
            if (contadorOficinas >= 1) {
                System.err.println("Los inmuebles disponibles de tipo Oficina son: ");
            } else {
                System.out.println("No hay oficinas registradas.");
            }
            for (int i = 0; i < listaInmuebles.size(); i++) {
                if (listaInmuebles.get(i) instanceof Oficina) {
                    Oficina oficinas = (Oficina) listaInmuebles.get(i);
                    System.out.println(" ");
                    System.out.print(oficinas.getId() + "-" + oficinas.getTipo() + "-" + oficinas.getMetrosCuadradosConstruidos() + "-" + oficinas.getEstrato() + "-" + oficinas.getValorBaseMetroCuadrado() + "-" + oficinas.isParqueaderoVisitante());
                }
            }

        } else if (opcionConsulta == 2) {
            if (contadorCasas >= 1) {
                System.err.println("Los inmuebles disponibles de tipo Vivienda Casa son: ");
            } else {
                System.out.println("No hay Casas registradas.");
            }
            for (int i = 0; i < listaInmuebles.size(); i++) {
                if (listaInmuebles.get(i) instanceof ViviendaCasa) {
                    ViviendaCasa viviendasCasa = (ViviendaCasa) listaInmuebles.get(i);
                    System.out.println(" ");
                    System.out.print(viviendasCasa.getId() + "-" + viviendasCasa.getTipo() + "-" + viviendasCasa.getMetrosCuadradosConstruidos() + "-" + viviendasCasa.getEstrato() + "-" + viviendasCasa.getValorBaseMetroCuadrado() + "-" + viviendasCasa.getNumeroParqueaderos() + "-" + viviendasCasa.isVigilanciaPrivada());
                }
            }

        } else if (opcionConsulta == 3) {
            if (contadorApartamentos >= 1) {
                System.err.println("Los inmuebles disponibles de tipo Vivienda Apartamento son: ");
            } else {
                System.out.println("No se han registrado apartamentos");
            }
            for (int i = 0; i < listaInmuebles.size(); i++) {
                if (listaInmuebles.get(i) instanceof ViviendaApartamento) {
                    ViviendaApartamento viviendasApartamento = (ViviendaApartamento) listaInmuebles.get(i);
                    System.out.println(" ");
                    System.out.print(viviendasApartamento.getId() + "-" + viviendasApartamento.getTipo() + "-" + viviendasApartamento.getMetrosCuadradosConstruidos() + "-" + viviendasApartamento.getEstrato() + "-" + viviendasApartamento.getValorBaseMetroCuadrado() + "-" + viviendasApartamento.getNumeroParqueaderos() + "-" + viviendasApartamento.getPiso());

                }
            }
        } else if (opcionConsulta == 4) {
            desplegarMenu();
        }

    }

    private void venderInmueble() {

        int productosEncontrados = 0;
        Inmueble inmueble;

        System.out.println("Para poder hacer la venta del inmueble, es necesario que conozca el Id del producto que quiere comprar. ¿Ya lo conoce? \n 1. Si. \n 2. No. \n 3. Volver al menú");
        System.out.print("Opcion: ");
        String opcionVenta = sc.nextLine();

        switch (opcionVenta) {

            case "1":
                System.out.println("Ingrese el Id del producto que quiere comprar: ");
                System.out.print("Id: ");
                int idOpcion = sc.nextInt();

                for (int i = 0; i < listaInmuebles.size(); i++) {
                    if (idOpcion == listaInmuebles.get(i).getId()) {
                        productosEncontrados++;
                        inmueble = listaInmuebles.get(i);

                        if (inmueble instanceof Oficina) {

                            System.out.println("Se encontró una oficina:");
                            Oficina oficina = (Oficina) inmueble;
                            System.out.println(oficina.getId() + "-" + oficina.getTipo() + "-" + oficina.getMetrosCuadradosConstruidos() + "-" + oficina.getEstrato() + "-" + oficina.getValorBaseMetroCuadrado() + "-" + oficina.isParqueaderoVisitante());
                            System.out.println("¿Este es el producto que desea comprar? \n Si.1" + "\n No.2");
                            System.out.print("Opcion: ");
                            int opcionCompraOficina = sc.nextInt();

                            switch (opcionCompraOficina) {
                                case 1:

                                    int valorOficina = calcularValorOficina(inmueble);
                                    System.out.println("El valor de la oficina es: " + valorOficina);
                                    System.out.println("Oficina vendida! ");
                                    listaInmuebles.remove(i);
                                    contadorOficinas--;
                                    break;

                                case 2:
                                    System.out.print("No comprado");
                                    break;

                                default:
                                    System.out.println("Opción incorrecta.");
                                    venderInmueble();
                            }

                        } else if (inmueble instanceof ViviendaCasa) {
                            System.out.println("Se encontró una casa:");
                            ViviendaCasa viviendaCasa = (ViviendaCasa) inmueble;
                            System.out.println(viviendaCasa.getId() + "-" + viviendaCasa.getTipo() + "-" + viviendaCasa.getMetrosCuadradosConstruidos() + "-" + viviendaCasa.getEstrato() + "-" + viviendaCasa.getValorBaseMetroCuadrado() + "-" + viviendaCasa.getNumeroParqueaderos() + "-" + viviendaCasa.isVigilanciaPrivada());
                            System.out.println("¿Desea comprarla? \n Si.1 \n No.2");
                            System.out.print("Opcion: ");
                            int opcionCompraCasa = sc.nextInt();

                            switch (opcionCompraCasa) {

                                case 1:
                                    int valorVivienda = calcularValorVivienda(inmueble);
                                    contadorDineroRecaudado += valorVivienda;
                                    int impuestoCasa = (int) (valorVivienda * 0.05);
                                    contadorImpuesto += impuestoCasa;
                                    int valorFinalCasaConImpuesto = valorVivienda + impuestoCasa;
                                    contadorDineroRecaudadoMasImpuestos += valorFinalCasaConImpuesto;

                                    System.out.println("El valor de la Casa es de: " + valorFinalCasaConImpuesto + " con impuesto de: " + impuestoCasa + " incluido");
                                    System.out.println("Casa vendida!");
                                    listaInmuebles.remove(i);
                                    contadorCasas--;
                                    break;
                                case 2:
                                    System.out.print("No comprado");
                                    break;

                                default:
                                    System.out.println("Opcion incorrecta.");
                                    venderInmueble();
                            }

                        } else if (inmueble instanceof ViviendaApartamento) {
                            System.out.println("Se encontro un Apartamento:");
                            ViviendaApartamento viviendaApartamento = (ViviendaApartamento) inmueble;
                            System.out.println(viviendaApartamento.getId() + "-" + viviendaApartamento.getTipo() + "-" + viviendaApartamento.getMetrosCuadradosConstruidos() + "-" + viviendaApartamento.getEstrato() + "-" + viviendaApartamento.getValorBaseMetroCuadrado() + "-" + viviendaApartamento.getNumeroParqueaderos() + "-" + viviendaApartamento.getPiso());
                            System.out.println("¿Desea comprarla? \n Si.1 \n No.2");
                            System.out.print("Opcion: ");
                            int opcionCompraApartamento = sc.nextInt();

                            switch (opcionCompraApartamento) {
                                case 1:

                                    int valorViviendaApartamento = calcularValorVivienda(inmueble);
                                    contadorDineroRecaudado += valorViviendaApartamento;
                                    int impuestoApartamento = (int) (valorViviendaApartamento * 0.05);
                                    contadorImpuesto += impuestoApartamento;
                                    int valorFinalApartamentoConImpuesto = (int) (valorViviendaApartamento + impuestoApartamento);
                                    contadorDineroRecaudadoMasImpuestos += valorFinalApartamentoConImpuesto;
                                    System.out.println("El valor del Apartamento es: " + valorFinalApartamentoConImpuesto + " con impuesto de: " + impuestoApartamento + " incluido");
                                    System.out.println("Apartamento vendido!");
                                    listaInmuebles.remove(i);
                                    contadorApartamentos--;
                                    break;

                                case 2:
                                    System.out.print("No comprado");
                                    break;

                                default:
                                    System.out.println("Opcion incorrecta.");
                                    venderInmueble();
                            }

                        }
                    }

                }
                break;

            case "2":
                mostrarInmueblesDisponibles(); //Algo pasa aquí               
                break;

            case "3":
                desplegarMenu();
                break;

            default:
                System.err.println("Opción no válida.");
                venderInmueble();
                break;
        }
    }

    private int calcularValorOficina(Inmueble objetoInmueble) {

        Oficina oficina = (Oficina) objetoInmueble;

        int precioBaseVivienda = oficina.getMetrosCuadradosConstruidos() * oficina.getValorBaseMetroCuadrado();

        int aumento = (int) (precioBaseVivienda * 0.05) * oficina.getEstrato();
        precioBaseVivienda += aumento;

        if (oficina.isParqueaderoVisitante() == true) {
            precioBaseVivienda += precioBaseVivienda * 0.2;
        } else {
            precioBaseVivienda -= precioBaseVivienda * 0.1;
        }

        contadorDineroRecaudado += precioBaseVivienda;

        if (oficina.getMetrosCuadradosConstruidos() > 100) {

            double valorImpuestoOficina = precioBaseVivienda * 0.07;
            contadorImpuesto += valorImpuestoOficina;
            double valorOficinaConImpuesto = precioBaseVivienda + valorImpuestoOficina;
            contadorDineroRecaudadoMasImpuestos += valorOficinaConImpuesto;
            precioBaseVivienda += valorImpuestoOficina;
            System.out.print("Se le adicionará un impuesto por exceder de 100m^2. ");

        }

        return precioBaseVivienda;
    }

    private static int calcularValorVivienda(Inmueble objetoVivienda) {

        Scanner sc = new Scanner(System.in);
        int descuentoCasaSinVigilancia;
        int precioBaseVivienda;
        int incremento;

        if (objetoVivienda instanceof ViviendaCasa) {
            ViviendaCasa viviendaCasa = (ViviendaCasa) objetoVivienda;

            if (viviendaCasa.isVigilanciaPrivada() == false) {
                precioBaseVivienda = viviendaCasa.getMetrosCuadradosConstruidos() * viviendaCasa.getValorBaseMetroCuadrado();
                incremento = (int) (precioBaseVivienda * 0.025) * viviendaCasa.getEstrato();
                precioBaseVivienda += incremento;
                descuentoCasaSinVigilancia = (int) (precioBaseVivienda * 0.1);
                precioBaseVivienda -= descuentoCasaSinVigilancia;

                return precioBaseVivienda;
            } else {
                precioBaseVivienda = viviendaCasa.getMetrosCuadradosConstruidos() * viviendaCasa.getValorBaseMetroCuadrado();
                incremento = (int) (precioBaseVivienda * 0.025) * viviendaCasa.getEstrato();
                int precioViviendaFinal = precioBaseVivienda + incremento;
                return precioViviendaFinal;
            }
        } else if (objetoVivienda instanceof ViviendaApartamento) {
            ViviendaApartamento viviendaApartamento = (ViviendaApartamento) objetoVivienda;

            precioBaseVivienda = (int) (viviendaApartamento.getMetrosCuadradosConstruidos() * viviendaApartamento.getValorBaseMetroCuadrado());
            incremento = (int) (precioBaseVivienda * 0.025) * viviendaApartamento.getEstrato();
            precioBaseVivienda += incremento;
            double decremento = (precioBaseVivienda * 0.015) * viviendaApartamento.getPiso();
            precioBaseVivienda -= decremento;
            return precioBaseVivienda;
        }
        return 0;
    }

    private void darRecaudoNeto() {
        System.out.println("El total de recaudo por ventas hasta el momento es de: " + contadorDineroRecaudado);
    }

    private void darImpuestosPagados() {
        System.out.println("El valor total pagado por impuestos es de: " + contadorImpuesto);
    }

    private void darRecaudosDespuesDeImpuestos() {
        System.out.println("El total de recaudo por ventas hasta el momento es de: " + contadorDineroRecaudadoMasImpuestos + " incluyendo los impuestos.");
    }

    public ArrayList<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    public void setListaInmuebles(ArrayList<Inmueble> listaInmuebles) {
        this.listaInmuebles = listaInmuebles;
    }

}
