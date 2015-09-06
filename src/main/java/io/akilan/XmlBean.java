package io.akilan;

/**
 * Created by akilan on 6/9/15.
 */
public class XmlBean {
    String line;

    public XmlBean(String line) {
        this.line = line;
    }

    public XmlBean() {
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XmlBean xmlBean = (XmlBean) o;

        return !(line != null ? !line.equals(xmlBean.line) : xmlBean.line != null);

    }

    @Override
    public int hashCode() {
        return line != null ? line.hashCode() : 0;
    }
}
