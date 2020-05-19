public class NomCognom{
    private int edat;
    private String tel;

    NomCognom(int e, String t)
    {
        edat=e;
        tel=t;
    }

    public NomCognom() {
    }

    public String toString() {
        return "NomCognom{" +
                "edat=" + edat +
                ", tel='" + tel + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        NomCognom nomCognom = (NomCognom) object;

        if (edat != nomCognom.edat) return false;
        if (tel != null ? !tel.equals(nomCognom.tel) : nomCognom.tel != null) return false;

        return true;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
