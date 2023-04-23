package br.com.siteBaristaMaster.model;
import java.sql.Date;
import java.sql.Time;
public class Produtos {

    private String nome_produto;
    private String categoria_produto;
    private String subcategoria_produto;
    private String descritivo;
    private String precoCustoString;
    private double preco_custo;
    private double preco_venda;
    private String marca;
    private String modelo;
    private String unidade;
    private boolean produto_ativo;
    private int estoque_total;
    private int estoque_minimo;
    private String origem;
    private String NCM;
    private String CEST;
    private Date data_inicial;
    private Date data_final;
    private Time hora;
    private String precoVendaString;

    public Produtos(String nome_produto, String categoria_produto, String subcategoria_produto, String descritivo, /*String precoCustoString,*/ double preco_custo, double preco_venda, String marca, String modelo, String unidade, int estoque_total, int estoque_minimo, String origem, String NCM, String CEST/*, String precoVendaString*/) {
        this.nome_produto = nome_produto;
        this.categoria_produto = categoria_produto;
        this.subcategoria_produto = subcategoria_produto;
        this.descritivo = descritivo;
//        this.precoCustoString = precoCustoString;
        this.preco_custo = preco_custo;
        this.preco_venda = preco_venda;
        this.marca = marca;
        this.modelo = modelo;
        this.unidade = unidade;
        this.estoque_total = estoque_total;
        this.estoque_minimo = estoque_minimo;
        this.origem = origem;
        this.NCM = NCM;
        this.CEST = CEST;
//        this.precoVendaString = precoVendaString;
    }

    public String getPrecoVendaString() {
        return precoVendaString;
    }



    public String getPrecoCustoString() {
        return precoCustoString;
    }



    public String getCategoria_produto() {
        return categoria_produto;
    }



    public String getSubcategoria_produto() {
        return subcategoria_produto;
    }



    public String getDescritivo() {
        return descritivo;
    }



    public double getPreco_custo() {
        return preco_custo;
    }



    public double getPreco_venda() {
        return preco_venda;
    }



    public String getMarca() {
        return marca;
    }



    public String getModelo() {
        return modelo;
    }



    public String getUnidade() {
        return unidade;
    }



    public boolean isProduto_ativo() {
        return produto_ativo;
    }



    public int getEstoque_total() {
        return estoque_total;
    }



    public int getEstoque_minimo() {
        return estoque_minimo;
    }



    public String getOrigem() {
        return origem;
    }



    public String getNCM() {
        return NCM;
    }



    public String getCEST() {
        return CEST;
    }



    public Date getData_inicial() {
        return data_inicial;
    }



    public Date getData_final() {
        return data_final;
    }



    public Time getHora() {
        return hora;
    }



    public String getNome_produto() {
        return nome_produto;
    }




}
