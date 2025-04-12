/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Connection$Method;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection$KeyVal;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class FormElement
extends Element {
    private final Elements elements;

    public FormElement(Tag cloneable, String string2, Attributes attributes) {
        super((Tag)cloneable, string2, attributes);
        super();
        this.elements = cloneable;
    }

    public FormElement addElement(Element element) {
        ((AbstractCollection)this.elements).add(element);
        return this;
    }

    public FormElement clone() {
        return (FormElement)super.clone();
    }

    public Elements elements() {
        return this.elements;
    }

    public List formData() {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator iterator = ((AbstractCollection)this.elements).iterator();
        while (bl2 = iterator.hasNext()) {
            Object object;
            Object object2;
            boolean bl3;
            int n3;
            Object object3 = (Element)iterator.next();
            Object object4 = ((Element)object3).tag();
            boolean bl4 = ((Tag)object4).isFormSubmittable();
            if (!bl4 || (bl4 = ((Node)object3).hasAttr((String)(object4 = "disabled"))) || (n3 = ((String)(object4 = ((Node)object3).attr("name"))).length()) == 0 || (bl3 = ((String)(object2 = ((Node)object3).attr("type"))).equalsIgnoreCase((String)(object = "button"))) || (bl3 = ((String)object2).equalsIgnoreCase((String)(object = "image")))) continue;
            object = "select";
            String string2 = ((Element)object3).normalName();
            bl3 = ((String)object).equals(string2);
            if (bl3) {
                boolean bl5;
                object2 = ((AbstractCollection)((Element)object3).select("option[selected]")).iterator();
                bl3 = false;
                object = null;
                while (bl5 = object2.hasNext()) {
                    object = ((Element)object2.next()).val();
                    object = HttpConnection$KeyVal.create((String)object4, (String)object);
                    arrayList.add(object);
                    bl3 = true;
                }
                if (bl3 || (object3 = ((Element)object3).selectFirst((String)(object2 = "option"))) == null) continue;
                object3 = ((Element)object3).val();
                object3 = HttpConnection$KeyVal.create((String)object4, (String)object3);
                arrayList.add(object3);
                continue;
            }
            object = "checkbox";
            bl3 = ((String)object).equalsIgnoreCase((String)object2);
            if (!bl3 && (n3 = (int)(((String)(object = "radio")).equalsIgnoreCase((String)object2) ? 1 : 0)) == 0) {
                object3 = ((Element)object3).val();
                object3 = HttpConnection$KeyVal.create((String)object4, (String)object3);
                arrayList.add(object3);
                continue;
            }
            object2 = "checked";
            n3 = (int)(((Node)object3).hasAttr((String)object2) ? 1 : 0);
            if (n3 == 0) continue;
            object2 = ((Element)object3).val();
            n3 = ((String)object2).length();
            object3 = n3 > 0 ? ((Element)object3).val() : "on";
            object3 = HttpConnection$KeyVal.create((String)object4, (String)object3);
            arrayList.add(object3);
        }
        return arrayList;
    }

    public void removeChild(Node node) {
        super.removeChild(node);
        this.elements.remove(node);
    }

    public Connection submit() {
        Object object = "action";
        boolean bl2 = this.hasAttr((String)object);
        object = bl2 ? this.absUrl((String)object) : this.baseUri();
        Validate.notEmpty((String)object, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        Object object2 = this.attr("method");
        Object object3 = "POST";
        bl2 = object2.equalsIgnoreCase((String)object3);
        object2 = bl2 ? Connection$Method.POST : Connection$Method.GET;
        object3 = this.ownerDocument();
        object3 = object3 != null ? ((Document)object3).connection().newRequest() : Jsoup.newSession();
        object = object3.url((String)object);
        object3 = this.formData();
        return object.data((Collection)object3).method((Connection$Method)((Object)object2));
    }
}

