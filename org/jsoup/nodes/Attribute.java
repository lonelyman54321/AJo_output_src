/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Range$AttributeRange;

public class Attribute
implements Map.Entry,
Cloneable {
    private static final String[] booleanAttributes = new String[]{"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private static final Pattern htmlKeyReplace;
    private static final Pattern htmlKeyValid;
    private static final Pattern xmlKeyReplace;
    private static final Pattern xmlKeyValid;
    private String key;
    Attributes parent;
    private String val;

    static {
        xmlKeyValid = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
        xmlKeyReplace = Pattern.compile("[^-a-zA-Z0-9_:.]");
        htmlKeyValid = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
        htmlKeyReplace = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");
    }

    public Attribute(String string2, String string3) {
        this(string2, string3, null);
    }

    public Attribute(String string2, String string3, Attributes attributes) {
        Validate.notNull(string2);
        string2 = string2.trim();
        Validate.notEmpty(string2);
        this.key = string2;
        this.val = string3;
        this.parent = attributes;
    }

    public static Attribute createFromEncoded(String string2, String string3) {
        string3 = Entities.unescape(string3, true);
        Attribute attribute = new Attribute(string2, string3, null);
        return attribute;
    }

    public static String getValidKey(String string2, Document$OutputSettings$Syntax object) {
        boolean bl2;
        Matcher matcher;
        boolean bl3;
        Object object2 = Document$OutputSettings$Syntax.xml;
        String string3 = null;
        String string4 = "";
        if (object == object2 && !(bl3 = (matcher = ((Pattern)(object2 = xmlKeyValid)).matcher(string2)).matches())) {
            object = ((Pattern)object2).matcher(string2 = xmlKeyReplace.matcher(string2).replaceAll(string4));
            boolean bl4 = ((Matcher)object).matches();
            if (bl4) {
                string3 = string2;
            }
            return string3;
        }
        object2 = Document$OutputSettings$Syntax.html;
        if (object == object2 && !(bl2 = ((Matcher)(object2 = ((Pattern)(object = htmlKeyValid)).matcher(string2))).matches())) {
            object2 = htmlKeyReplace;
            boolean bl5 = ((Matcher)(object = ((Pattern)object).matcher(string2 = ((Pattern)object2).matcher(string2).replaceAll(string4)))).matches();
            if (bl5) {
                string3 = string2;
            }
            return string3;
        }
        return string2;
    }

    public static void html(String string2, String string3, Appendable appendable, Document$OutputSettings document$OutputSettings) {
        Document$OutputSettings$Syntax document$OutputSettings$Syntax = document$OutputSettings.syntax();
        if ((string2 = Attribute.getValidKey(string2, document$OutputSettings$Syntax)) == null) {
            return;
        }
        Attribute.htmlNoValidate(string2, string3, appendable, document$OutputSettings);
    }

    public static void htmlNoValidate(String string2, String string3, Appendable appendable, Document$OutputSettings document$OutputSettings) {
        appendable.append(string2);
        char c2 = Attribute.shouldCollapseAttribute(string2, string3, document$OutputSettings);
        if (c2 == '\u0000') {
            string2 = "=\"";
            appendable.append(string2);
            String string4 = Attributes.checkNotNull(string3);
            boolean bl2 = true;
            Entities.escape(appendable, string4, document$OutputSettings, bl2, false, false, false);
            c2 = '\"';
            appendable.append(c2);
        }
    }

    public static boolean isBooleanAttribute(String string2) {
        Object[] objectArray = booleanAttributes;
        int n3 = Arrays.binarySearch(objectArray, string2 = Normalizer.lowerCase(string2));
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        return n3 != 0;
    }

    public static boolean isDataAttribute(String string2) {
        int n3;
        String string3 = "data-";
        int n4 = string2.startsWith(string3);
        if (n4 != 0 && (n3 = string2.length()) > (n4 = 5)) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        return n3 != 0;
    }

    public static boolean shouldCollapseAttribute(String string2, String string3, Document$OutputSettings object) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Document$OutputSettings$Syntax document$OutputSettings$Syntax;
        if ((object = object.syntax()) == (document$OutputSettings$Syntax = Document$OutputSettings$Syntax.html) && (string3 == null || ((bl4 = string3.isEmpty()) || (bl3 = string3.equalsIgnoreCase(string2))) && (bl2 = Attribute.isBooleanAttribute(string2)))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public Attribute clone() {
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            RuntimeException runtimeException = new RuntimeException(cloneNotSupportedException);
            throw runtimeException;
        }
        return (Attribute)object;
    }

    public boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            boolean bl3;
            object = (Attribute)object;
            object3 = this.key;
            if (object3 != null ? !(bl3 = ((String)object3).equals(object2 = ((Attribute)object).key)) : (object3 = ((Attribute)object).key) != null) {
                return false;
            }
            object3 = this.val;
            object = ((Attribute)object).val;
            if (object3 != null) {
                bl2 = ((String)object3).equals(object);
            } else if (object != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return Attributes.checkNotNull(this.val);
    }

    public boolean hasDeclaredValue() {
        boolean bl2;
        String string2 = this.val;
        if (string2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public int hashCode() {
        int n3;
        String string2 = this.key;
        int n4 = 0;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n3 *= 31;
        String string3 = this.val;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String html() {
        Object object;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        String string2 = "";
        try {
            object = new Document(string2);
            object = ((Document)object).outputSettings();
        }
        catch (IOException iOException) {
            object = new SerializationException(iOException);
            throw object;
        }
        this.html(stringBuilder, (Document$OutputSettings)object);
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public void html(Appendable appendable, Document$OutputSettings document$OutputSettings) {
        String string2 = this.key;
        String string3 = this.val;
        Attribute.html(string2, string3, appendable, document$OutputSettings);
    }

    public boolean isDataAttribute() {
        return Attribute.isDataAttribute(this.key);
    }

    public void setKey(String string2) {
        int n3;
        String[] stringArray;
        int n4;
        Validate.notNull(string2);
        string2 = string2.trim();
        Validate.notEmpty(string2);
        Attributes attributes = this.parent;
        if (attributes != null && (n4 = attributes.indexOfKey((String)(stringArray = this.key))) != (n3 = -1)) {
            stringArray = this.parent.keys;
            stringArray[n4] = string2;
        }
        this.key = string2;
    }

    public String setValue(String string2) {
        int n3;
        Object[] objectArray;
        int n4;
        Object object = this.val;
        Attributes attributes = this.parent;
        if (attributes != null && (n4 = attributes.indexOfKey((String)(objectArray = this.key))) != (n3 = -1)) {
            object = this.parent;
            objectArray = this.key;
            object = ((Attributes)object).get((String)objectArray);
            objectArray = this.parent.vals;
            objectArray[n4] = string2;
        }
        this.val = string2;
        return Attributes.checkNotNull(object);
    }

    public final boolean shouldCollapseAttribute(Document$OutputSettings document$OutputSettings) {
        String string2 = this.key;
        String string3 = this.val;
        return Attribute.shouldCollapseAttribute(string2, string3, document$OutputSettings);
    }

    public Range$AttributeRange sourceRange() {
        Attributes attributes = this.parent;
        if (attributes == null) {
            return Range$AttributeRange.UntrackedAttr;
        }
        String string2 = this.key;
        return attributes.sourceRange(string2);
    }

    public String toString() {
        return this.html();
    }
}

