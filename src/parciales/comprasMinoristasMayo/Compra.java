/*
 1- Queremos representar compras minoristas y mayoristas. De cualquier compra se conoce: nro. y los productos
comprados (como máximo N). 
a- Genere las clases necesarias. Provea constructores para iniciar las compras a partir de toda su información,
para una cantidad máxima de N productos comprados y sin productos cargados.
 */
package parciales.comprasMinoristasMayo;

/**
 *
 */
public abstract class Compra {
    private int nro;
    private Producto[] productos;

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
    private int N;
    private int cant = 0;
    
    public Compra(int N, int unnro){
        this.productos = new Producto[N];
        this.nro = unnro;
        for (int i = 0; i < N; i++) {
            Producto producto = new Producto();
            productos[i] = producto;
        }
    }
    
    public Compra(int unnro){
        this.nro = unnro;
    }
 /*b- Implemente métodos en las clases que corresponda para permitir:
i- Agregar a la compra un producto que se recibe. Asuma que hay espacio.*/   
    public void LlenarProducto(Producto producto){
            productos[cant] = producto;
            cant++;        
    }
    /*ii- Obtener el precio a pagar por la compra teniendo en cuenta que es la suma del precio de los productos
comprados al que se adiciona el IVA (21% del total).*/
    public double precioTotal(){
        double aux=0; double iva;
        for (int i = 0; i < this.cant; i++) {
            aux =aux+ productos[i].getPrecio();
        }
        iva = aux * 0.21;
        return aux+iva;
    }
    /*iii- Obtener la representación String de la compra siguiendo el ejemplo:
Compra minorista: “Nro:… , Productos (código/precio/descripción):…, Precio a pagar:… , Es jubilado: …”
Compra mayorista: “Nro:…, Productos (código/precio/descripción):…, Precio a pagar:…, CUIT:…” */
    @Override
    public String toString(){
        String produc = " ";
    
         for (int i = 0; i < this.cant; i++) {
            produc =produc + "\n (código/precio/descripción): "+productos[i].toString();
        }
        String aux = "Nro: " + getNro()+ produc + " Precio a pagar: " + this.precioTotal();
        return aux;
             //Nro:… , Productos (código/precio/descripción):…, Precio a pagar:… ,
        
    }
}
