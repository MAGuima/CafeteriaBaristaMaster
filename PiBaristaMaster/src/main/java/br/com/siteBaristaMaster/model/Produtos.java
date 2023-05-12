package br.com.siteBaristaMaster.model;
import java.sql.Date;
import java.sql.Time;
public class Produtos {
    private String codigo_produto; //0
    private String nome_produto; //1
    private String categoria_produto; //2
    private double preco_venda;//3
    private String image;//4
    private String descritivo; //5




//    public Produtos(String nome_produto, String categoria_produto, String subcategoria_produto, String descritivo, /*String precoCustoString,*/ double preco_custo, double preco_venda, String image, String modelo, String unidade, int estoque_total, int estoque_minimo, String origem, String NCM, String CEST/*, String precoVendaString*/) {
//        this.nome_produto = nome_produto;
//        this.categoria_produto = categoria_produto;
//        this.subcategoria_produto = subcategoria_produto;
//        this.descritivo = descritivo;
////        this.precoCustoString = precoCustoString;
//        this.preco_custo = preco_custo;
//        this.preco_venda = preco_venda;
//        this.image = image;
//        this.modelo = modelo;
//        this.unidade = unidade;
//        this.estoque_total = estoque_total;
//        this.estoque_minimo = estoque_minimo;
//        this.origem = origem;
//        this.NCM = NCM;
//        this.CEST = CEST;
////        this.precoVendaString = precoVendaString;
//    }

    public Produtos(String codigo_produto, String nome_produto, String categoria_produto, double preco_venda, String image,String descritivo) {
        this.codigo_produto = codigo_produto; //0
        this.nome_produto = nome_produto; // 1
        this.categoria_produto = categoria_produto; // 2
        this.preco_venda = preco_venda; // 3
        this.image = image;//4
        this.descritivo = descritivo; // 5
        //Produtos produtos = new Produtos(codigo_produto,nomeProduto,descritivo,preco_venda,image,categoria_produto);


    }

    public String getCodigo_produto() {
        return codigo_produto;
    }



    public String getCategoria_produto() {
        return categoria_produto;
    }




    public String getDescritivo() {
        return descritivo;
    }




    public double getPreco_venda() {
        return preco_venda;
    }



    public String getImage() {
        return image;
    }





    public String getNome_produto() {
        return nome_produto;
    }




}
