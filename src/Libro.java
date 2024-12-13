public abstract class Libro
{
    private String titulo;
    private Persona autor;
    private String isbn;
    private int paginas;
    private int edicion;
    private String editorial;
    private String ciudad;
    private String pais;
    private Fecha fechaEdicion;

    public Libro(String titulo, Persona autor, String isbn, int paginas, int edicion, String editorial, String ciudad, String pais, Fecha fechaEdicion)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaEdicion = fechaEdicion;
    }

    // Getters y setters
    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public Persona getAutor()
    {
        return autor;
    }

    public void setAutor(Persona autor)
    {
        this.autor = autor;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public int getPaginas()
    {
        return paginas;
    }

    public void setPaginas(int paginas)
    {
        this.paginas = paginas;
    }

    public int getEdicion()
    {
        return edicion;
    }

    public void setEdicion(int edicion)
    {
        this.edicion = edicion;
    }

    public String getEditorial()
    {
        return editorial;
    }

    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }

    public String getCiudad()
    {
        return ciudad;
    }

    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }

    public String getPais()
    {
        return pais;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }

    public Fecha getFechaEdicion()
    {
        return fechaEdicion;
    }

    public void setFechaEdicion(Fecha fechaEdicion)
    {
        this.fechaEdicion = fechaEdicion;
    }


    public void mostrarInformacion()
    {
        System.out.println("Título: " + titulo);
        System.out.println(edicion + "ª edición");
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println(editorial + ", " + ciudad + " (" + pais + "), " + fechaEdicion);
        System.out.println(paginas + " páginas");
    }


    public abstract void leerInformacion();
}