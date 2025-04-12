/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

public class Elements
extends ArrayList {
    public Elements() {
    }

    public Elements(int n3) {
        super(n3);
    }

    public Elements(Collection collection) {
        super(collection);
    }

    public Elements(List list) {
        super(list);
    }

    public Elements(Element ... object) {
        object = Arrays.asList(object);
        super(object);
    }

    private List childNodesOfType(Class clazz) {
        boolean bl2;
        ArrayList<Node> arrayList = new ArrayList<Node>();
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            int n3;
            Element element = (Element)iterator.next();
            for (int i3 = 0; i3 < (n3 = element.childNodeSize()); ++i3) {
                Node node = element.childNode(i3);
                boolean bl3 = clazz.isInstance(node);
                if (!bl3) continue;
                node = (Node)clazz.cast(node);
                arrayList.add(node);
            }
        }
        return arrayList;
    }

    private Elements siblings(String object, boolean bl2, boolean bl3) {
        boolean bl4;
        Elements elements = new Elements();
        object = object != null ? QueryParser.parse((String)object) : null;
        Iterator iterator = ((AbstractCollection)this).iterator();
        block0: while (bl4 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            while ((element = bl2 ? element.nextElementSibling() : element.previousElementSibling()) != null) {
                if (object == null) {
                    ((AbstractCollection)elements).add(element);
                } else {
                    boolean bl5 = element.is((Evaluator)object);
                    if (bl5) {
                        ((AbstractCollection)elements).add(element);
                    }
                }
                if (bl3) continue;
                continue block0;
            }
        }
        return elements;
    }

    public Elements addClass(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.addClass(string2);
        }
        return this;
    }

    public Elements after(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.after(string2);
        }
        return this;
    }

    public Elements append(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.append(string2);
        }
        return this;
    }

    public String attr(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            boolean bl3 = element.hasAttr(string2);
            if (!bl3) continue;
            return element.attr(string2);
        }
        return "";
    }

    public Elements attr(String string2, String string3) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.attr(string2, string3);
        }
        return this;
    }

    public Elements before(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.before(string2);
        }
        return this;
    }

    public void clear() {
        this.remove();
        super.clear();
    }

    public Elements clone() {
        boolean bl2;
        int n3 = ((AbstractCollection)this).size();
        Elements elements = new Elements(n3);
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = ((Element)iterator.next()).clone();
            ((AbstractCollection)elements).add(object);
        }
        return elements;
    }

    public List comments() {
        return this.childNodesOfType(Comment.class);
    }

    public List dataNodes() {
        return this.childNodesOfType(DataNode.class);
    }

    public List eachAttr(String string2) {
        boolean bl2;
        int n3 = ((AbstractCollection)this).size();
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (Element)iterator.next();
            boolean bl3 = ((Node)object).hasAttr(string2);
            if (!bl3) continue;
            object = ((Node)object).attr(string2);
            arrayList.add(object);
        }
        return arrayList;
    }

    public List eachText() {
        boolean bl2;
        int n3 = ((AbstractCollection)this).size();
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (Element)iterator.next();
            boolean bl3 = ((Element)object).hasText();
            if (!bl3) continue;
            object = ((Element)object).text();
            arrayList.add(object);
        }
        return arrayList;
    }

    public Elements empty() {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.empty();
        }
        return this;
    }

    public Elements eq(int n3) {
        Elements elements;
        int n4 = ((AbstractCollection)this).size();
        if (n4 > n3) {
            Element element = (Element)((AbstractList)this).get(n3);
            int n7 = 1;
            Element[] elementArray = new Element[n7];
            elementArray[0] = element;
            elements = new Elements(elementArray);
        } else {
            elements = new Elements();
        }
        return elements;
    }

    public Elements filter(NodeFilter nodeFilter) {
        NodeTraversor.filter(nodeFilter, this);
        return this;
    }

    public Element first() {
        Element element;
        boolean bl2 = ((AbstractCollection)this).isEmpty();
        if (bl2) {
            bl2 = false;
            element = null;
        } else {
            bl2 = false;
            element = (Element)((AbstractList)this).get(0);
        }
        return element;
    }

    public List forms() {
        boolean bl2;
        ArrayList<Element> arrayList = new ArrayList<Element>();
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            boolean bl3 = element instanceof FormElement;
            if (!bl3) continue;
            element = (FormElement)element;
            arrayList.add(element);
        }
        return arrayList;
    }

    public boolean hasAttr(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            bl2 = element.hasAttr(string2);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public boolean hasClass(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            bl2 = element.hasClass(string2);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public boolean hasText() {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            bl2 = element.hasText();
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public String html() {
        boolean bl2;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (Element)iterator.next();
            int n3 = stringBuilder.length();
            if (n3 != 0) {
                String string2 = "\n";
                stringBuilder.append(string2);
            }
            object = ((Element)object).html();
            stringBuilder.append((String)object);
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public Elements html(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.html(string2);
        }
        return this;
    }

    public boolean is(String object) {
        boolean bl2;
        object = QueryParser.parse((String)object);
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            bl2 = element.is((Evaluator)object);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public Element last() {
        Element element;
        boolean n3 = ((AbstractCollection)this).isEmpty();
        if (n3) {
            boolean bl2 = false;
            element = null;
        } else {
            int n4 = ((AbstractCollection)this).size() + -1;
            element = (Element)((AbstractList)this).get(n4);
        }
        return element;
    }

    public Elements next() {
        return this.siblings(null, true, false);
    }

    public Elements next(String string2) {
        return this.siblings(string2, true, false);
    }

    public Elements nextAll() {
        boolean bl2 = true;
        return this.siblings(null, bl2, bl2);
    }

    public Elements nextAll(String string2) {
        boolean bl2 = true;
        return this.siblings(string2, bl2, bl2);
    }

    public Elements not(String object) {
        object = Selector.select((String)object, this);
        return Selector.filterOut(this, (Collection)object);
    }

    public String outerHtml() {
        boolean bl2;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (Element)iterator.next();
            int n3 = stringBuilder.length();
            if (n3 != 0) {
                String string2 = "\n";
                stringBuilder.append(string2);
            }
            object = ((Node)object).outerHtml();
            stringBuilder.append((String)object);
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public Elements parents() {
        boolean bl2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object object = ((AbstractCollection)this).iterator();
        while (bl2 = object.hasNext()) {
            Elements elements = ((Element)object.next()).parents();
            linkedHashSet.addAll(elements);
        }
        object = new Elements((Collection)linkedHashSet);
        return object;
    }

    public Elements prepend(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.prepend(string2);
        }
        return this;
    }

    public Elements prev() {
        return this.siblings(null, false, false);
    }

    public Elements prev(String string2) {
        return this.siblings(string2, false, false);
    }

    public Elements prevAll() {
        return this.siblings(null, false, true);
    }

    public Elements prevAll(String string2) {
        return this.siblings(string2, false, true);
    }

    public Element remove(int n3) {
        Element element = (Element)super.remove(n3);
        element.remove();
        return element;
    }

    public Elements remove() {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.remove();
        }
        return this;
    }

    public boolean remove(Object object) {
        int n3;
        int n4 = super.indexOf(object);
        if (n4 == (n3 = -1)) {
            return false;
        }
        this.remove(n4);
        return true;
    }

    public boolean removeAll(Collection object) {
        boolean bl2;
        object = object.iterator();
        boolean bl3 = false;
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = this.remove(e2);
            bl3 |= bl2;
        }
        return bl3;
    }

    public Elements removeAttr(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.removeAttr(string2);
        }
        return this;
    }

    public Elements removeClass(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.removeClass(string2);
        }
        return this;
    }

    public boolean removeIf(Predicate predicate) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            bl2 = Wh.b(predicate, element);
            if (!bl2) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        int n3;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)this).size()); ++i3) {
            Element element = (Element)((AbstractList)this).get(i3);
            element = (Element)Xh.b(unaryOperator, element);
            this.set(i3, element);
        }
    }

    public boolean retainAll(Collection collection) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            bl2 = collection.contains(element);
            if (bl2) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public Elements select(String string2) {
        return Selector.select(string2, this);
    }

    public Element set(int n3, Element element) {
        Validate.notNull(element);
        Element element2 = super.set(n3, element);
        element2.replaceWith(element);
        return element2;
    }

    public Elements tagName(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.tagName(string2);
        }
        return this;
    }

    public String text() {
        boolean bl2;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (Element)iterator.next();
            int n3 = stringBuilder.length();
            if (n3 != 0) {
                String string2 = " ";
                stringBuilder.append(string2);
            }
            object = ((Element)object).text();
            stringBuilder.append((String)object);
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public List textNodes() {
        return this.childNodesOfType(TextNode.class);
    }

    public String toString() {
        return this.outerHtml();
    }

    public Elements toggleClass(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.toggleClass(string2);
        }
        return this;
    }

    public Elements traverse(NodeVisitor nodeVisitor) {
        NodeTraversor.traverse(nodeVisitor, this);
        return this;
    }

    public Elements unwrap() {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.unwrap();
        }
        return this;
    }

    public String val() {
        int n3 = ((AbstractCollection)this).size();
        if (n3 > 0) {
            return this.first().val();
        }
        return "";
    }

    public Elements val(String string2) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.val(string2);
        }
        return this;
    }

    public Elements wrap(String string2) {
        boolean bl2;
        Validate.notEmpty(string2);
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (bl2 = iterator.hasNext()) {
            Element element = (Element)iterator.next();
            element.wrap(string2);
        }
        return this;
    }
}

