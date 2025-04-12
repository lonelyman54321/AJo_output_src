/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes$1;
import org.jsoup.nodes.Attributes$Dataset;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Range$AttributeRange;
import org.jsoup.parser.ParseSettings;

public class Attributes
implements Iterable,
Cloneable {
    private static final String EmptyString = "";
    private static final int GrowthFactor = 2;
    private static final int InitialCapacity = 3;
    static final char InternalPrefix = '/';
    static final int NotFound = 255;
    protected static final String dataPrefix = "data-";
    String[] keys;
    private int size = 0;
    Object[] vals;

    public Attributes() {
        int n3 = 3;
        String[] stringArray = new String[n3];
        this.keys = stringArray;
        Object[] objectArray = new Object[n3];
        this.vals = objectArray;
    }

    public static /* synthetic */ int access$000(Attributes attributes) {
        return attributes.size;
    }

    public static /* synthetic */ void access$100(Attributes attributes, int n3) {
        attributes.remove(n3);
    }

    public static /* synthetic */ String access$400(String string2) {
        return Attributes.dataKey(string2);
    }

    private void addObject(String string2, Object object) {
        int n3 = this.size + 1;
        this.checkCapacity(n3);
        String[] stringArray = this.keys;
        int n4 = this.size;
        stringArray[n4] = string2;
        this.vals[n4] = object;
        this.size = ++n4;
    }

    private void checkCapacity(int n3) {
        String[] stringArray;
        int n4 = this.size;
        if (n3 >= n4) {
            n4 = 1;
        } else {
            n4 = 0;
            stringArray = null;
        }
        Validate.isTrue(n4 != 0);
        stringArray = this.keys;
        int n7 = stringArray.length;
        if (n7 >= n3) {
            return;
        }
        int n8 = 3;
        if (n7 >= n8) {
            n7 = this.size;
            n8 = n7 * 2;
        }
        if (n3 <= n8) {
            n3 = n8;
        }
        this.keys = stringArray = Arrays.copyOf(stringArray, n3);
        Object[] objectArray = Arrays.copyOf(this.vals, n3);
        this.vals = objectArray;
    }

    public static String checkNotNull(Object object) {
        object = object == null ? EmptyString : (String)object;
        return object;
    }

    private static String dataKey(String string2) {
        return kp1_0.c(dataPrefix, string2);
    }

    private int indexOfKeyIgnoreCase(String string2) {
        int n3;
        Validate.notNull(string2);
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            String string3 = this.keys[i3];
            n3 = (int)(string2.equalsIgnoreCase(string3) ? 1 : 0);
            if (n3 == 0) continue;
            return i3;
        }
        return -1;
    }

    public static String internalKey(String string2) {
        return kp1_0.c("/", string2);
    }

    public static boolean isInternalKey(String string2) {
        char c2;
        int n3;
        int n4;
        boolean bl2 = false;
        if (string2 != null && (n4 = string2.length()) > (n3 = 1) && (c2 = string2.charAt(0)) == (n4 = 47)) {
            bl2 = true;
        }
        return bl2;
    }

    private void remove(int n3) {
        int n4 = this.size;
        int n7 = 1;
        n4 = n3 >= n4 ? 1 : 0;
        Validate.isFalse(n4 != 0);
        n4 = this.size - n3 - n7;
        if (n4 > 0) {
            Object[] objectArray = this.keys;
            int n8 = n3 + 1;
            System.arraycopy(objectArray, n8, objectArray, n3, n4);
            objectArray = this.vals;
            System.arraycopy(objectArray, n8, objectArray, n3, n4);
        }
        this.size = n3 = this.size - n7;
        this.keys[n3] = null;
        this.vals[n3] = null;
    }

    public Attributes add(String string2, String string3) {
        this.addObject(string2, string3);
        return this;
    }

    public void addAll(Attributes object) {
        int n3 = ((Attributes)object).size();
        if (n3 == 0) {
            return;
        }
        n3 = this.size;
        int n4 = ((Attributes)object).size;
        this.checkCapacity(n3 += n4);
        n3 = this.size;
        n3 = n3 != 0 ? 1 : 0;
        object = ((Attributes)object).iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (Attribute)object.next();
            if (n3 != 0) {
                this.put((Attribute)object2);
                continue;
            }
            Object object3 = ((Attribute)object2).getKey();
            object2 = ((Attribute)object2).getValue();
            this.add((String)object3, (String)object2);
        }
    }

    public List asList() {
        int n3;
        int n4 = this.size;
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        for (n4 = 0; n4 < (n3 = this.size); ++n4) {
            Object object = this.keys[n4];
            n3 = (int)(Attributes.isInternalKey((String)object) ? 1 : 0);
            if (n3 != 0) continue;
            String string2 = this.keys[n4];
            String string3 = (String)this.vals[n4];
            object = new Attribute(string2, string3, this);
            arrayList.add(object);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Attributes clone() {
        int n3;
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            RuntimeException runtimeException = new RuntimeException(cloneNotSupportedException);
            throw runtimeException;
        }
        object = (Attributes)object;
        ((Attributes)object).size = n3 = this.size;
        Object[] objectArray = this.keys;
        int n4 = this.size;
        objectArray = Arrays.copyOf(objectArray, n4);
        ((Attributes)object).keys = objectArray;
        objectArray = this.vals;
        n4 = this.size;
        objectArray = Arrays.copyOf(objectArray, n4);
        ((Attributes)object).vals = objectArray;
        return object;
    }

    public Map dataset() {
        Attributes$Dataset attributes$Dataset = new Attributes$Dataset(this, null);
        return attributes$Dataset;
    }

    /*
     * WARNING - void declaration
     */
    public int deduplicate(ParseSettings parseSettings) {
        void var2_4;
        String[] stringArray;
        int n3;
        boolean n4 = this.isEmpty();
        int n7 = 0;
        if (n4) {
            return 0;
        }
        boolean bl2 = parseSettings.preserveAttributeCase();
        boolean bl3 = false;
        while (n7 < (n3 = (stringArray = this.keys).length)) {
            Object object;
            Object object2;
            int n8;
            for (int i3 = n3 = n7 + 1; i3 < (n8 = ((String[])(object2 = this.keys)).length) && (object = object2[i3]) != null; ++i3) {
                boolean bl4;
                if (!bl2 || !(bl4 = ((String)(object2 = object2[n7])).equals(object))) {
                    if (bl2) continue;
                    object2 = this.keys;
                    object = object2[n7];
                    bl4 = ((String)object).equalsIgnoreCase((String)(object2 = object2[i3]));
                    if (!bl4) continue;
                }
                ++var2_4;
                this.remove(i3);
                i3 += -1;
            }
            n7 = n3;
        }
        return (int)var2_4;
    }

    public boolean equals(Object object) {
        Object object2;
        Class<?> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = this.getClass()) == (object2 = object.getClass())) {
            object = (Attributes)object;
            int n3 = this.size;
            int n4 = ((Attributes)object).size;
            if (n3 != n4) {
                return false;
            }
            clazz = null;
            for (n3 = 0; n3 < (n4 = this.size); ++n3) {
                int n7;
                object2 = this.keys[n3];
                n4 = ((Attributes)object).indexOfKey((String)object2);
                if (n4 == (n7 = -1)) {
                    return false;
                }
                Object object3 = this.vals[n3];
                Object[] objectArray = ((Attributes)object).vals;
                object2 = objectArray[n4];
                if (!(object3 == null ? object2 != null : (n4 = (int)(object3.equals(object2) ? 1 : 0)) == 0)) continue;
                return false;
            }
            return bl2;
        }
        return false;
    }

    public String get(String string2) {
        int n3;
        int n4 = this.indexOfKey(string2);
        if (n4 == (n3 = -1)) {
            string2 = EmptyString;
        } else {
            Object[] objectArray = this.vals;
            string2 = Attributes.checkNotNull(objectArray[n4]);
        }
        return string2;
    }

    public String getIgnoreCase(String string2) {
        int n3;
        int n4 = this.indexOfKeyIgnoreCase(string2);
        if (n4 == (n3 = -1)) {
            string2 = EmptyString;
        } else {
            Object[] objectArray = this.vals;
            string2 = Attributes.checkNotNull(objectArray[n4]);
        }
        return string2;
    }

    public boolean hasDeclaredValueForKey(String object) {
        Object[] objectArray;
        int n3;
        int n4 = this.indexOfKey((String)object);
        if (n4 != (n3 = -1) && (object = (objectArray = this.vals)[n4]) != null) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public boolean hasDeclaredValueForKeyIgnoreCase(String object) {
        Object[] objectArray;
        int n3;
        int n4 = this.indexOfKeyIgnoreCase((String)object);
        if (n4 != (n3 = -1) && (object = (objectArray = this.vals)[n4]) != null) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public boolean hasKey(String string2) {
        int n3;
        int n4 = this.indexOfKey(string2);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        return n4 != 0;
    }

    public boolean hasKeyIgnoreCase(String string2) {
        int n3;
        int n4 = this.indexOfKeyIgnoreCase(string2);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        return n4 != 0;
    }

    public int hashCode() {
        int n3 = this.size * 31;
        int n4 = Arrays.hashCode(this.keys);
        n3 = (n3 + n4) * 31;
        return Arrays.hashCode(this.vals) + n3;
    }

    public String html() {
        Object object;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        String string2 = EmptyString;
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

    public final void html(Appendable appendable, Document$OutputSettings document$OutputSettings) {
        int n3 = this.size;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = this.keys[i3];
            boolean bl2 = Attributes.isInternalKey(string2);
            if (bl2) continue;
            string2 = this.keys[i3];
            Object object = document$OutputSettings.syntax();
            if ((string2 = Attribute.getValidKey(string2, object)) == null) continue;
            object = (String)this.vals[i3];
            char c2 = ' ';
            Appendable appendable2 = appendable.append(c2);
            Attribute.htmlNoValidate(string2, (String)object, appendable2, document$OutputSettings);
        }
    }

    public int indexOfKey(String string2) {
        int n3;
        Validate.notNull(string2);
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            String string3 = this.keys[i3];
            n3 = (int)(string2.equals(string3) ? 1 : 0);
            if (n3 == 0) continue;
            return i3;
        }
        return -1;
    }

    public boolean isEmpty() {
        int n3 = this.size;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public Iterator iterator() {
        Attributes$1 attributes$1 = new Attributes$1(this);
        return attributes$1;
    }

    public void normalize() {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            String string2;
            String[] stringArray = this.keys[i3];
            n3 = (int)(Attributes.isInternalKey((String)stringArray) ? 1 : 0);
            if (n3 != 0) continue;
            stringArray = this.keys;
            stringArray[i3] = string2 = Normalizer.lowerCase(stringArray[i3]);
        }
    }

    public Attributes put(String objectArray, String string2) {
        Validate.notNull(objectArray);
        int n3 = this.indexOfKey((String)objectArray);
        int n4 = -1;
        if (n3 != n4) {
            objectArray = this.vals;
            objectArray[n3] = string2;
        } else {
            this.add((String)objectArray, string2);
        }
        return this;
    }

    public Attributes put(String string2, boolean bl2) {
        if (bl2) {
            bl2 = false;
            this.putIgnoreCase(string2, null);
        } else {
            this.remove(string2);
        }
        return this;
    }

    public Attributes put(Attribute attribute) {
        Validate.notNull(attribute);
        Object object = attribute.getKey();
        Object object2 = attribute.getValue();
        this.put((String)object, (String)object2);
        attribute.parent = this;
        return this;
    }

    public void putIgnoreCase(String string2, String object) {
        int n3;
        int n4 = this.indexOfKeyIgnoreCase(string2);
        if (n4 != (n3 = -1)) {
            Object[] objectArray = this.vals;
            objectArray[n4] = object;
            object = this.keys[n4];
            boolean bl2 = object.equals(string2);
            if (!bl2) {
                object = this.keys;
                object[n4] = string2;
            }
        } else {
            this.add(string2, (String)object);
        }
    }

    public void remove(String string2) {
        int n3;
        int n4 = this.indexOfKey(string2);
        if (n4 != (n3 = -1)) {
            this.remove(n4);
        }
    }

    public void removeIgnoreCase(String string2) {
        int n3;
        int n4 = this.indexOfKeyIgnoreCase(string2);
        if (n4 != (n3 = -1)) {
            this.remove(n4);
        }
    }

    public int size() {
        return this.size;
    }

    public Range$AttributeRange sourceRange(String object) {
        boolean bl2 = this.hasKey((String)object);
        if (!bl2) {
            return Range$AttributeRange.UntrackedAttr;
        }
        Map map2 = (Map)this.userData("jsoup.attrs");
        if (map2 == null) {
            return Range$AttributeRange.UntrackedAttr;
        }
        if ((object = (Range$AttributeRange)map2.get(object)) == null) {
            object = Range$AttributeRange.UntrackedAttr;
        }
        return object;
    }

    public String toString() {
        return this.html();
    }

    public Object userData(String string2) {
        Validate.notNull(string2);
        String string3 = "/jsoup.userdata";
        boolean bl2 = this.hasKey(string3);
        if (!bl2) {
            return null;
        }
        return this.userData().get(string2);
    }

    public Map userData() {
        Object object;
        int n3;
        Object object2 = "/jsoup.userdata";
        int n4 = this.indexOfKey((String)object2);
        if (n4 == (n3 = -1)) {
            object = new HashMap();
            this.addObject((String)object2, object);
        } else {
            object = object2 = this.vals[n4];
            object = (Map)object2;
        }
        return object;
    }

    public Attributes userData(String string2, Object object) {
        Validate.notNull(string2);
        this.userData().put(string2, object);
        return this;
    }
}

