package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport html = new HtmlReport();
        JSONReport jsn = new JSONReport();
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        String textJsn = jsn.generate("name", "body");
        System.out.println(textJsn);
        String textHtml = html.generate("name", "body");
        System.out.println(textHtml);
    }
}