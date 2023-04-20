package br.com.siteBaristaMaster.model;
import java.sql.Date;
import java.sql.Time;
public class Produtos {

    private String nome_produto;
    private String categoria_produto;
    private String subcategoria_produto;
    private String descritivo;
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

    public String getCategoria_produto() {
        return categoria_produto;
    }

    public void setCategoria_produto(String categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    public String getSubcategoria_produto() {
        return subcategoria_produto;
    }

    public void setSubcategoria_produto(String subcategoria_produto) {
        this.subcategoria_produto = subcategoria_produto;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public boolean isProduto_ativo() {
        return produto_ativo;
    }

    public void setProduto_ativo(boolean produto_ativo) {
        this.produto_ativo = produto_ativo;
    }

    public int getEstoque_total() {
        return estoque_total;
    }

    public void setEstoque_total(int estoque_total) {
        this.estoque_total = estoque_total;
    }

    public int getEstoque_minimo() {
        return estoque_minimo;
    }

    public void setEstoque_minimo(int estoque_minimo) {
        this.estoque_minimo = estoque_minimo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getNCM() {
        return NCM;
    }

    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    public String getCEST() {
        return CEST;
    }

    public void setCEST(String CEST) {
        this.CEST = CEST;
    }

    public Date getData_inicial() {
        return data_inicial;
    }

    public void setData_inicial(Date data_inicial) {
        this.data_inicial = data_inicial;
    }

    public Date getData_final() {
        return data_final;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getNome_produto() {
        return nome_produto;
    }


    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

}
