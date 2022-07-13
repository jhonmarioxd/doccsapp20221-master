package model;

import java.io.Serializable;


/**
 *
 * @author Mario
 */
public class Reports implements Serializable{
    private String TitlePage;
    //portada
    private String rating;
    //indice
    private String Introduction;
    //intriduccion
    private String ReportBody;
    //cuerpo del informe
    private String Conclusions;
    //conclusiones
    private String Bibliography;
    //bibliografia
    
    public Reports(String TitlePage, String rating, String Introduction, String ReportBodye, String conclusions, String Bibliography) {
        this.TitlePage = TitlePage;
        this.rating = rating;
        this.Introduction = Introduction;
        this.ReportBody = ReportBodye;
        this.Conclusions = conclusions;
        this.Bibliography = Bibliography;
    }
    
    public Reports() {
    }
    
    public String getTitlePage() {
        return TitlePage;
    }

    public void setTitlePage(String TitlePage) {
        this.TitlePage = TitlePage;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String Introduction) {
        this.Introduction = Introduction;
    }

    public String getReportBody() {
        return ReportBody;
    }

    public void setReportBody(String ReportBody) {
        this.ReportBody = ReportBody;
    }

    public String getConclusions() {
        return Conclusions;
    }

    public void setConclusions(String Conclusions) {
        this.Conclusions = Conclusions;
    }

    public String getBibliography() {
        return Bibliography;
    }

    public void setBibliography(String Bibliography) {
        this.Bibliography = Bibliography;
    }

    
    @Override
    public String toString() {
        return "Memorandum{" + "TitlePage=" + TitlePage + ", rating=" + rating + ", Introduction=" + Introduction + ", Report Body=" + ReportBody + ", Conclusions=" + Conclusions + ", Bibliography=" + Bibliography + '}';
    }
    
    
    
}