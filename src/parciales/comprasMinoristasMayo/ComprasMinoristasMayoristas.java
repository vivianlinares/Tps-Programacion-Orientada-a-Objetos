package parciales.comprasMinoristasMayo;

/* 17:09
1- Queremos representar compras minoristas y mayoristas. De cualquier compra se conoce: nro. y los productos
comprados (como máximo N). De cada producto registra: código, precio y descripción. Además: las compras
mayoristas tienen el CUIT del comprador; y las minoristas si el comprador es jubilado.
a- Genere las clases necesarias. Provea constructores para iniciar las compras a partir de toda su información,
para una cantidad máxima de N productos comprados y sin productos cargados.
b- Implemente métodos en las clases que corresponda para permitir:
i- Agregar a la compra un producto que se recibe. Asuma que hay espacio.
ii- Obtener el precio a pagar por la compra teniendo en cuenta que es la suma del precio de los productos
comprados al que se adiciona el IVA (21% del total).
iii- Obtener la representación String de la compra siguiendo el ejemplo:
Compra minorista: “Nro:… , Productos (código/precio/descripción):…, Precio a pagar:… , Es jubilado: …”
Compra mayorista: “Nro:…, Productos (código/precio/descripción):…, Precio a pagar:…, CUIT:…”
2) Realice un programa que instancie una compra mayorista y una minorista. Cargue 3 productos a cada compra.
Para finalizar, muestre la representación String de cada compra. */
/**
 *
 */
public class ComprasMinoristasMayoristas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*2) Realice un programa que instancie una compra mayorista y una minorista. Cargue 3 productos a cada compra.
Para finalizar, muestre la representación String de cada compra. */
        CompraMinorista CM ; Producto producto1,producto2, producto3; 
        
        CM = new CompraMinorista(false,3,000);
        producto1 = new Producto(1223, 23.3,"aceite");
        producto2 = new Producto(1203, 100.3,"arroz");
        producto3 = new Producto(1222, 34.3, "yogur");
        CM.LlenarProducto(producto1);
        CM.LlenarProducto(producto3);
        CM.LlenarProducto(producto2);
       
        System.out.println(CM.toString());
    }
    
}
