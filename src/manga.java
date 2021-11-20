public abstract class manga implements authorized {
   
    String auteur;
    String resume;
    int nbrePages;

    public manga(String auteur, String resume, int nbrePages) {
        this.auteur = auteur;
        this.resume = resume;
        this.nbrePages = nbrePages;
    }

    public abstract void type();

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public int getNbrePages() {
        return nbrePages;
    }

    public void setNbrePages(int nbrePages) {
        this.nbrePages = nbrePages;
    }
}
