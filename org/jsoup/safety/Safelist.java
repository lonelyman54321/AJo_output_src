/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.safety;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.safety.Safelist$AttributeKey;
import org.jsoup.safety.Safelist$AttributeValue;
import org.jsoup.safety.Safelist$Protocol;
import org.jsoup.safety.Safelist$TagName;

public class Safelist {
    private static final String All = ":all";
    private final Map attributes;
    private final Map enforcedAttributes;
    private boolean preserveRelativeLinks;
    private final Map protocols;
    private final Set tagNames;

    public Safelist() {
        Cloneable cloneable;
        this.tagNames = cloneable = new Cloneable();
        this.attributes = cloneable;
        super();
        this.enforcedAttributes = cloneable;
        super();
        this.protocols = cloneable;
        this.preserveRelativeLinks = false;
    }

    public Safelist(Safelist safelist) {
        this();
        boolean bl2;
        Object object;
        Object object2;
        Map map2;
        boolean bl3;
        Iterator iterator = this.tagNames;
        Object object3 = safelist.tagNames;
        iterator.addAll(object3);
        iterator = safelist.attributes.entrySet().iterator();
        while (bl3 = iterator.hasNext()) {
            object3 = (Map.Entry)iterator.next();
            map2 = this.attributes;
            object2 = (Safelist$TagName)object3.getKey();
            object3 = (Collection)object3.getValue();
            object = new HashSet(object3);
            map2.put(object2, object);
        }
        iterator = safelist.enforcedAttributes.entrySet().iterator();
        while (bl3 = iterator.hasNext()) {
            object3 = iterator.next();
            map2 = this.enforcedAttributes;
            object2 = (Safelist$TagName)object3.getKey();
            object3 = (Map)object3.getValue();
            super(object3);
            map2.put(object2, object);
        }
        iterator = safelist.protocols.entrySet().iterator();
        while (bl3 = iterator.hasNext()) {
            boolean bl4;
            object3 = iterator.next();
            super();
            object2 = ((Map)object3.getValue()).entrySet().iterator();
            while (bl4 = object2.hasNext()) {
                object = (Map.Entry)object2.next();
                Safelist$AttributeKey safelist$AttributeKey = (Safelist$AttributeKey)object.getKey();
                object = (Collection)object.getValue();
                HashSet hashSet = new HashSet(object);
                ((HashMap)map2).put(safelist$AttributeKey, hashSet);
            }
            object2 = this.protocols;
            object3 = (Safelist$TagName)object3.getKey();
            object2.put(object3, map2);
        }
        this.preserveRelativeLinks = bl2 = safelist.preserveRelativeLinks;
    }

    public static Safelist basic() {
        Safelist safelist = new Safelist();
        String[] stringArray = new String[]{"a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "u", "ul"};
        safelist = safelist.addTags(stringArray);
        stringArray = "href";
        Object object = new String[]{stringArray};
        String string2 = "a";
        safelist = safelist.addAttributes(string2, (String)object);
        object = "cite";
        String[] stringArray2 = new String[]{object};
        String string3 = "blockquote";
        safelist = safelist.addAttributes(string3, stringArray2);
        String[] stringArray3 = new String[]{object};
        safelist = safelist.addAttributes("q", stringArray3);
        String string4 = "http";
        String string5 = "https";
        stringArray2 = new String[]{"ftp", string4, string5, "mailto"};
        safelist = safelist.addProtocols(string2, (String)stringArray, stringArray2);
        stringArray = new String[]{string4, string5};
        safelist = safelist.addProtocols(string3, (String)object, stringArray);
        stringArray = new String[]{string4, string5};
        return safelist.addProtocols((String)object, (String)object, stringArray).addEnforcedAttribute(string2, "rel", "nofollow");
    }

    public static Safelist basicWithImages() {
        Safelist safelist = Safelist.basic();
        String string2 = "img";
        String[] stringArray = new String[]{string2};
        safelist = safelist.addTags(stringArray);
        stringArray = new String[]{"align", "alt", "height", "src", "title", "width"};
        safelist = safelist.addAttributes(string2, stringArray);
        stringArray = new String[]{"http", "https"};
        return safelist.addProtocols(string2, "src", stringArray);
    }

    private boolean isValidAnchor(String string2) {
        boolean bl2;
        String string3 = "#";
        boolean bl3 = string2.startsWith(string3);
        if (bl3 && !(bl2 = string2.matches(string3 = ".*\\s.*"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public static Safelist none() {
        Safelist safelist = new Safelist();
        return safelist;
    }

    public static Safelist relaxed() {
        Safelist safelist = new Safelist();
        Object object = new String[]{"a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul"};
        safelist = safelist.addTags((String)object);
        String[] stringArray = "href";
        object = new String[]{stringArray, "title"};
        String[] stringArray2 = "a";
        safelist = safelist.addAttributes((String)stringArray2, (String)object);
        object = "cite";
        String[] stringArray3 = new String[]{object};
        String string2 = "blockquote";
        safelist = safelist.addAttributes(string2, stringArray3);
        stringArray3 = "span";
        String[] stringArray4 = "width";
        Object object2 = new String[]{stringArray3, stringArray4};
        safelist = safelist.addAttributes("col", (String)object2);
        stringArray3 = new String[]{stringArray3, stringArray4};
        safelist = safelist.addAttributes("colgroup", stringArray3);
        stringArray3 = new String[]{"align", "alt", "height", "src", "title", "width"};
        object2 = "img";
        safelist = safelist.addAttributes((String)object2, stringArray3);
        String string3 = "type";
        stringArray3 = new String[]{"start", string3};
        safelist = safelist.addAttributes("ol", stringArray3);
        stringArray3 = new String[]{object};
        String string4 = "q";
        safelist = safelist.addAttributes(string4, stringArray3);
        stringArray3 = new String[]{"summary", stringArray4};
        safelist = safelist.addAttributes("table", stringArray3);
        stringArray3 = new String[]{"abbr", "axis", "colspan", "rowspan", stringArray4};
        safelist = safelist.addAttributes("td", stringArray3);
        stringArray3 = new String[]{"abbr", "axis", "colspan", "rowspan", "scope", "width"};
        safelist = safelist.addAttributes("th", stringArray3);
        stringArray4 = new String[]{string3};
        safelist = safelist.addAttributes("ul", stringArray4);
        string3 = "http";
        String string5 = "https";
        stringArray3 = new String[]{"ftp", string3, string5, "mailto"};
        safelist = safelist.addProtocols((String)stringArray2, (String)stringArray, stringArray3);
        stringArray = new String[]{string3, string5};
        safelist = safelist.addProtocols(string2, (String)object, stringArray);
        stringArray = new String[]{string3, string5};
        safelist = safelist.addProtocols((String)object, (String)object, stringArray);
        stringArray2 = new String[]{string3, string5};
        safelist = safelist.addProtocols((String)object2, "src", stringArray2);
        stringArray = new String[]{string3, string5};
        return safelist.addProtocols(string4, (String)object, stringArray);
    }

    public static Safelist simpleText() {
        Safelist safelist = new Safelist();
        String[] stringArray = new String[]{"b", "em", "i", "strong", "u"};
        return safelist.addTags(stringArray);
    }

    private boolean testValidProtocol(Element object, Attribute object2, Set object3) {
        boolean bl2;
        Object object4 = ((Attribute)object2).getKey();
        int n3 = ((String)(object = ((Node)object).absUrl((String)object4))).length();
        if (n3 == 0) {
            object = ((Attribute)object2).getValue();
        }
        if ((n3 = (int)(this.preserveRelativeLinks ? 1 : 0)) == 0) {
            ((Attribute)object2).setValue((String)object);
        }
        object2 = object3.iterator();
        while (bl2 = object2.hasNext()) {
            object3 = ((Safelist$Protocol)object2.next()).toString();
            object4 = "#";
            n3 = (int)(((String)object3).equals(object4) ? 1 : 0);
            boolean bl3 = true;
            if (n3 != 0) {
                bl2 = this.isValidAnchor((String)object);
                if (!bl2) continue;
                return bl3;
            }
            object3 = ((String)object3).concat(":");
            object4 = Normalizer.lowerCase((String)object);
            bl2 = ((String)object4).startsWith((String)object3);
            if (!bl2) continue;
            return bl3;
        }
        return false;
    }

    public Safelist addAttributes(String object, String ... object2) {
        Object object3;
        Validate.notEmpty((String)object);
        Validate.notNull(object2);
        boolean bl2 = ((String[])object2).length;
        int n3 = 0;
        if (bl2 > false) {
            bl2 = true;
        } else {
            bl2 = false;
            object3 = null;
        }
        String string2 = "No attribute names supplied.";
        Validate.isTrue(bl2, string2);
        object3 = new String[]{object};
        this.addTags((String[])object3);
        object = Safelist$TagName.valueOf((String)object);
        object3 = new HashSet();
        int n4 = ((String[])object2).length;
        while (n3 < n4) {
            Object object4 = object2[n3];
            Validate.notEmpty((String)object4);
            object4 = Safelist$AttributeKey.valueOf((String)object4);
            ((HashSet)object3).add(object4);
            ++n3;
        }
        object2 = this.attributes;
        boolean bl3 = object2.containsKey(object);
        if (bl3) {
            object2 = this.attributes;
            object = (Set)object2.get(object);
            object.addAll(object3);
        } else {
            object2 = this.attributes;
            object2.put(object, object3);
        }
        return this;
    }

    public Safelist addEnforcedAttribute(String object, String object2, String object3) {
        Validate.notEmpty((String)object);
        Validate.notEmpty((String)object2);
        Validate.notEmpty((String)object3);
        object = Safelist$TagName.valueOf((String)object);
        this.tagNames.add(object);
        object2 = Safelist$AttributeKey.valueOf((String)object2);
        object3 = Safelist$AttributeValue.valueOf((String)object3);
        HashMap<Object, Object> hashMap = this.enforcedAttributes;
        boolean bl2 = hashMap.containsKey(object);
        if (bl2) {
            hashMap = this.enforcedAttributes;
            object = (Map)hashMap.get(object);
            object.put(object2, object3);
        } else {
            hashMap = new HashMap<Object, Object>();
            hashMap.put(object2, object3);
            object2 = this.enforcedAttributes;
            object2.put(object, hashMap);
        }
        return this;
    }

    public Safelist addProtocols(String cloneable, String object, String ... stringArray) {
        Object object2;
        Validate.notEmpty((String)((Object)cloneable));
        Validate.notEmpty((String)object);
        Validate.notNull(stringArray);
        cloneable = Safelist$TagName.valueOf((String)((Object)cloneable));
        object = Safelist$AttributeKey.valueOf((String)object);
        Cloneable cloneable2 = this.protocols;
        int n3 = cloneable2.containsKey(cloneable);
        if (n3 != 0) {
            cloneable2 = this.protocols;
            cloneable = (Map)cloneable2.get(cloneable);
        } else {
            cloneable2 = new HashMap();
            object2 = this.protocols;
            object2.put(cloneable, cloneable2);
            cloneable = cloneable2;
        }
        n3 = cloneable.containsKey(object);
        if (n3 != 0) {
            cloneable = (Set)cloneable.get(object);
        } else {
            cloneable2 = new HashSet();
            cloneable.put(object, cloneable2);
            cloneable = cloneable2;
        }
        int n4 = stringArray.length;
        cloneable2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            object2 = stringArray[n3];
            Validate.notEmpty((String)object2);
            object2 = Safelist$Protocol.valueOf((String)object2);
            cloneable.add(object2);
        }
        return this;
    }

    public Safelist addTags(String ... stringArray) {
        Validate.notNull(stringArray);
        for (String string2 : stringArray) {
            Validate.notEmpty(string2);
            boolean bl2 = string2.equalsIgnoreCase("noscript");
            String string3 = "noscript is unsupported in Safelists, due to incompatibilities between parsers with and without script-mode enabled";
            Validate.isFalse(bl2, string3);
            Set set = this.tagNames;
            Safelist$TagName object = Safelist$TagName.valueOf(string2);
            set.add(object);
        }
        return this;
    }

    public Attributes getEnforcedAttributes(String iterator) {
        Attributes attributes = new Attributes();
        Object object = this.enforcedAttributes;
        boolean bl2 = object.containsKey(iterator = Safelist$TagName.valueOf((String)((Object)iterator)));
        if (bl2) {
            object = this.enforcedAttributes;
            iterator = ((Map)object.get(iterator)).entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object = iterator.next();
                String string2 = ((Safelist$AttributeKey)object.getKey()).toString();
                object = ((Safelist$AttributeValue)object.getValue()).toString();
                attributes.put(string2, (String)object);
            }
        }
        return attributes;
    }

    public boolean isSafeAttribute(String object, Element object2, Attribute attribute) {
        boolean bl2;
        Object object3 = Safelist$TagName.valueOf((String)object);
        Object object4 = Safelist$AttributeKey.valueOf((String)attribute.getKey());
        Set set = (Set)this.attributes.get(object3);
        boolean bl3 = false;
        boolean bl4 = true;
        if (set != null && (bl2 = set.contains(object4))) {
            object = this.protocols;
            boolean bl5 = object.containsKey(object3);
            if (bl5) {
                object = (Map)this.protocols.get(object3);
                boolean bl6 = object.containsKey(object4);
                if (!bl6 || (bl5 = this.testValidProtocol((Element)object2, attribute, (Set)(object = (Set)object.get(object4))))) {
                    bl3 = true;
                }
                return bl3;
            }
            return bl4;
        }
        object4 = this.enforcedAttributes;
        if ((object3 = (Map)object4.get(object3)) != null && (bl2 = ((Attributes)(object3 = this.getEnforcedAttributes((String)object))).hasKeyIgnoreCase((String)(object4 = attribute.getKey())))) {
            object = ((Attributes)object3).getIgnoreCase((String)object4);
            object2 = attribute.getValue();
            return ((String)object).equals(object2);
        }
        object3 = All;
        boolean bl7 = ((String)object).equals(object3);
        if (!bl7 && (bl7 = this.isSafeAttribute((String)object3, (Element)object2, attribute))) {
            bl3 = true;
        }
        return bl3;
    }

    public boolean isSafeTag(String object) {
        Set set = this.tagNames;
        object = Safelist$TagName.valueOf((String)object);
        return set.contains(object);
    }

    public Safelist preserveRelativeLinks(boolean bl2) {
        this.preserveRelativeLinks = bl2;
        return this;
    }

    public Safelist removeAttributes(String object, String ... object2) {
        boolean bl2;
        Safelist$TagName safelist$TagName;
        Validate.notEmpty((String)object);
        Validate.notNull(object2);
        boolean bl3 = ((String[])object2).length;
        int n3 = 0;
        if (bl3 > false) {
            bl3 = true;
        } else {
            bl3 = false;
            safelist$TagName = null;
        }
        Validate.isTrue(bl3, "No attribute names supplied.");
        safelist$TagName = Safelist$TagName.valueOf((String)object);
        HashSet<Object> hashSet = new HashSet<Object>();
        int n4 = ((String[])object2).length;
        while (n3 < n4) {
            Object object3 = object2[n3];
            Validate.notEmpty((String)object3);
            object3 = Safelist$AttributeKey.valueOf((String)object3);
            hashSet.add(object3);
            ++n3;
        }
        object2 = this.tagNames;
        boolean bl4 = object2.contains(safelist$TagName);
        if (bl4 && (bl4 = (object2 = this.attributes).containsKey(safelist$TagName))) {
            object2 = (Set)this.attributes.get(safelist$TagName);
            object2.removeAll(hashSet);
            bl4 = object2.isEmpty();
            if (bl4) {
                object2 = this.attributes;
                object2.remove(safelist$TagName);
            }
        }
        if (bl2 = ((String)object).equals(object2 = All)) {
            object = this.attributes.entrySet().iterator();
            while (bl4 = object.hasNext()) {
                object2 = (Set)((Map.Entry)object.next()).getValue();
                object2.removeAll(hashSet);
                bl4 = object2.isEmpty();
                if (!bl4) continue;
                object.remove();
            }
        }
        return this;
    }

    public Safelist removeEnforcedAttribute(String object, String object2) {
        Validate.notEmpty((String)object);
        Validate.notEmpty((String)object2);
        object = Safelist$TagName.valueOf((String)object);
        Object object3 = this.tagNames;
        boolean bl2 = object3.contains(object);
        if (bl2 && (bl2 = (object3 = this.enforcedAttributes).containsKey(object))) {
            object2 = Safelist$AttributeKey.valueOf((String)object2);
            object3 = (Map)this.enforcedAttributes.get(object);
            object3.remove(object2);
            boolean bl3 = object3.isEmpty();
            if (bl3) {
                object2 = this.enforcedAttributes;
                object2.remove(object);
            }
        }
        return this;
    }

    public Safelist removeProtocols(String object, String object2, String ... stringArray) {
        Validate.notEmpty((String)object);
        Validate.notEmpty((String)object2);
        Validate.notNull(stringArray);
        object = Safelist$TagName.valueOf((String)object);
        object2 = Safelist$AttributeKey.valueOf((String)object2);
        boolean bl2 = this.protocols.containsKey(object);
        Object object3 = "Cannot remove a protocol that is not set.";
        Validate.isTrue(bl2, (String)object3);
        Map map2 = (Map)this.protocols.get(object);
        Validate.isTrue(map2.containsKey(object2), (String)object3);
        object3 = (Set)map2.get(object2);
        for (String string2 : stringArray) {
            Validate.notEmpty(string2);
            Safelist$Protocol object4 = Safelist$Protocol.valueOf(string2);
            object3.remove(object4);
        }
        boolean bl3 = object3.isEmpty();
        if (bl3) {
            map2.remove(object2);
            boolean bl4 = map2.isEmpty();
            if (bl4) {
                object2 = this.protocols;
                object2.remove(object);
            }
        }
        return this;
    }

    public Safelist removeTags(String ... stringArray) {
        Validate.notNull(stringArray);
        for (String string2 : stringArray) {
            Validate.notEmpty(string2);
            Safelist$TagName object = Safelist$TagName.valueOf(string2);
            Object object2 = this.tagNames;
            boolean bl2 = object2.remove(object);
            if (!bl2) continue;
            this.attributes.remove(object);
            this.enforcedAttributes.remove(object);
            object2 = this.protocols;
            object2.remove(object);
        }
        return this;
    }
}

