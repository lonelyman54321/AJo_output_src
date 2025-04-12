/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 */
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public final class oJ {
    public final HashMap a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public final oJ$c e;
    public oJ$c f;

    public oJ(nb3_2 object, File file) {
        Object object2;
        this.a = object2 = new HashMap();
        this.b = object2 = new SparseArray();
        this.c = object2;
        super();
        this.d = object2;
        super((nb3_2)object);
        File file2 = new File(file, "cached_content_index.exi");
        object = new oJ$b(file2);
        this.e = object2;
        this.f = object;
    }

    public static zl0_0 a(DataInputStream object) {
        int n3 = ((DataInputStream)object).readInt();
        HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = ((DataInputStream)object).readUTF();
            int n4 = ((DataInputStream)object).readInt();
            if (n4 >= 0) {
                int n7 = 0xA00000;
                int n8 = Math.min(n4, n7);
                byte[] byArray = gz3.f;
                int n10 = 0;
                while (n10 != n4) {
                    int n14 = n10 + n8;
                    byArray = Arrays.copyOf(byArray, n14);
                    ((DataInputStream)object).readFully(byArray, n10, n8);
                    n8 = Math.min(n4 - n14, n7);
                    n10 = n14;
                }
                hashMap.put(string2, byArray);
                continue;
            }
            String string3 = hj0_0.a(n4, "Invalid value size: ");
            object = new IOException(string3);
            throw object;
        }
        object = new zl0_0(hashMap);
        return object;
    }

    public static void b(zl0_0 iterator, DataOutputStream dataOutputStream) {
        iterator = ((zl0_0)((Object)iterator)).b.entrySet();
        int n3 = iterator.size();
        dataOutputStream.writeInt(n3);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object = (Map.Entry)iterator.next();
            String string2 = (String)object.getKey();
            dataOutputStream.writeUTF(string2);
            object = (byte[])object.getValue();
            int n4 = ((Object)object).length;
            dataOutputStream.writeInt(n4);
            ((OutputStream)dataOutputStream).write((byte[])object);
        }
    }

    public final nJ c(String string2) {
        return (nJ)this.a.get(string2);
    }

    public final nJ d(String object) {
        HashMap hashMap = this.a;
        nJ nJ3 = (nJ)hashMap.get(object);
        if (nJ3 == null) {
            int n3;
            nJ3 = this.b;
            int n4 = nJ3.size();
            int n7 = 1;
            int n8 = 0;
            zl0_0 zl0_02 = null;
            if (n4 == 0) {
                n3 = 0;
            } else {
                n3 = n4 + -1;
                n3 = nJ3.keyAt(n3) + n7;
            }
            if (n3 < 0) {
                while (n8 < n4 && n8 == (n3 = nJ3.keyAt(n8))) {
                    ++n8;
                }
                n3 = n8;
            }
            zl0_02 = zl0_0.c;
            nJ nJ4 = new nJ(n3, (String)object, zl0_02);
            hashMap.put(object, nJ4);
            nJ3.put(n3, object);
            this.d.put(n3, n7 != 0);
            object = this.e;
            object.a(nJ4);
            nJ3 = nJ4;
        }
        return nJ3;
    }

    public final void e(long l2) {
        oJ$c oJ$c;
        oJ$c oJ$c2 = this.e;
        oJ$c2.d(l2);
        Object object = this.f;
        if (object != null) {
            object.d(l2);
        }
        boolean bl2 = oJ$c2.b();
        SparseArray sparseArray = this.b;
        object = this.a;
        if (!bl2 && (oJ$c = this.f) != null && (bl2 = oJ$c.b())) {
            oJ$c = this.f;
            oJ$c.g((HashMap)object, sparseArray);
            oJ$c2.e((HashMap)object);
        } else {
            oJ$c2.g((HashMap)object, sparseArray);
        }
        oJ$c = this.f;
        if (oJ$c != null) {
            oJ$c.delete();
            bl2 = false;
            oJ$c = null;
            this.f = null;
        }
    }

    public final void f(String string2) {
        AbstractCollection abstractCollection;
        boolean bl2;
        HashMap hashMap = this.a;
        nJ nJ3 = (nJ)hashMap.get(string2);
        if (nJ3 != null && (bl2 = ((TreeSet)(abstractCollection = nJ3.c)).isEmpty()) && (bl2 = ((ArrayList)(abstractCollection = nJ3.d)).isEmpty())) {
            hashMap.remove(string2);
            string2 = this.d;
            int n3 = nJ3.a;
            bl2 = string2.get(n3);
            oJ$c oJ$c = this.e;
            oJ$c.f(nJ3, bl2);
            nJ3 = this.b;
            if (bl2) {
                nJ3.remove(n3);
                string2.delete(n3);
            } else {
                nJ3.put(n3, null);
                string2 = this.c;
                boolean bl3 = true;
                string2.put(n3, bl3);
            }
        }
    }

    public final void g() {
        HashMap hashMap = this.a;
        oJ$c oJ$c = this.e;
        oJ$c.c(hashMap);
        hashMap = this.c;
        int n3 = hashMap.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            SparseArray sparseArray = this.b;
            int n4 = hashMap.keyAt(i3);
            sparseArray.remove(n4);
        }
        hashMap.clear();
        this.d.clear();
    }
}

