package io.akilan;

import fitlibrary.DoFixture;

import java.util.*;

/**
 * Created by akilan on 6/9/15.
 */
public class XmlDoFixture extends DoFixture {

    public XmlDoFixture() {
        System.out.println("Test........");
    }


    public List<XmlBean> listNormal(){

        List<XmlBean> lists =new ArrayList<>();
        lists.add(new XmlBean("One"));
        lists.add(new XmlBean("Two"));
        lists.add(new XmlBean("Three"));

        return lists;
    }

    public List<XmlBean> listXml(){

        List<XmlBean> lists =new ArrayList<>();
        lists.add(new XmlBean("<FIXML>"));
        lists.add(new XmlBean("<AllocInstrctnAlert TransTyp=”0” ID=”#1234567#book1#acc1#legal#\" GrpID = “1234567” AvgPxGrpID=”AP101” >"));

        return lists;
    }


}
