/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.play.core.assetpacks.AssetLocation;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.bq;
import com.google.android.play.core.assetpacks.br;
import com.google.android.play.core.assetpacks.ce;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.et;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

final class bm {
    private static final o a;
    private static final long b;
    private static final long c;
    private final Context d;
    private final et e;

    static {
        Object object = new o("AssetPackStorage");
        a = object;
        object = TimeUnit.DAYS;
        b = ((TimeUnit)((Object)object)).toMillis(14);
        c = ((TimeUnit)((Object)object)).toMillis(28);
    }

    public bm(Context context, et et2) {
        this.d = context;
        this.e = et2;
    }

    private static long H(File fileArray, boolean n3) {
        boolean bl2 = fileArray.exists();
        if (bl2) {
            int n4;
            Object object;
            Object[] objectArray;
            int n7;
            Object object2;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Object[] objectArray2 = null;
            if (n3 && (n3 = ((File[])(object2 = fileArray.listFiles())).length) > (n7 = 1)) {
                object2 = a;
                objectArray = new Object[]{};
                object = "Multiple pack versions found, using highest version code.";
                ((o)object2).e((String)object, objectArray);
            }
            fileArray = fileArray.listFiles();
            n3 = fileArray.length;
            objectArray = null;
            for (n7 = 0; n7 < n3; ++n7) {
                try {
                    object = fileArray[n7];
                }
                catch (NumberFormatException numberFormatException) {}
                String string2 = ((File)object).getName();
                String string3 = "stale.tmp";
                boolean bl3 = string2.equals(string3);
                if (bl3) continue;
                object = ((File)object).getName();
                object = Long.valueOf((String)object);
                arrayList.add(object);
                continue;
                object2 = a;
                objectArray2 = new Object[]{};
                objectArray = "Corrupt asset pack directories.";
                ((o)object2).c(numberFormatException, (String)objectArray, objectArray2);
                break;
            }
            if ((n4 = arrayList.isEmpty()) == 0) {
                Collections.sort(arrayList);
                n4 = arrayList.size() + -1;
                return (Long)arrayList.get(n4);
            }
        }
        return -1;
    }

    private final File I(String string2) {
        File file = this.L();
        File file2 = new File(file, string2);
        return file2;
    }

    private final File J(String object, int n3, long l2) {
        object = this.j((String)object, n3, l2);
        File file = new File((File)object, "merge.tmp");
        return file;
    }

    private final File K(String string2, int n3, long l2) {
        File file = this.M();
        File file2 = new File(file, string2);
        string2 = String.valueOf(n3);
        File file3 = new File(file2, string2);
        string2 = String.valueOf(l2);
        File file4 = new File(file3, string2);
        return file4;
    }

    private final File L() {
        Object object = this.d;
        object = object.getFilesDir();
        File file = new File((File)object, "assetpacks");
        return file;
    }

    private final File M() {
        File file = this.L();
        File file2 = new File(file, "_tmp");
        return file2;
    }

    private static List N(PackageInfo packageInfo, String string2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object[] objectArray = packageInfo.splitNames;
        if (objectArray != null) {
            boolean bl2;
            Object object;
            int n3;
            for (int i3 = -Arrays.binarySearch(objectArray, string2) + -1; i3 < (n3 = ((String[])(object = packageInfo.splitNames)).length) && (bl2 = ((String)(object = object[i3])).startsWith(string2)); ++i3) {
                object = packageInfo.applicationInfo.splitSourceDirs[i3];
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    private final List O() {
        ArrayList<Object> arrayList;
        block15: {
            int n3 = 1;
            String string2 = null;
            arrayList = new ArrayList<Object>();
            Object object = this.L();
            boolean bl2 = ((File)object).exists();
            if (!bl2) break block15;
            object = this.L();
            object = ((File)object).listFiles();
            if (object == null) break block15;
            object = this.L();
            object = ((File)object).listFiles();
            int n4 = ((Object)object).length;
            for (int i3 = 0; i3 < n4; i3 += n3) {
                Object object2;
                try {
                    object2 = object[i3];
                }
                catch (IOException iOException) {}
                String string3 = ((File)object2).getCanonicalPath();
                Object object3 = this.M();
                object3 = ((File)object3).getCanonicalPath();
                boolean bl3 = string3.equals(object3);
                if (bl3) continue;
                arrayList.add(object2);
                continue;
                o o3 = a;
                Object[] objectArray = new Object[n3];
                objectArray[0] = iOException;
                string2 = "Could not process directory while scanning installed packs. %s";
                o3.b(string2, objectArray);
                break;
            }
        }
        return arrayList;
    }

    private static void P(File fileArray) {
        int n3;
        int n4;
        File[] fileArray2 = fileArray.listFiles();
        if (fileArray2 != null && (n4 = (fileArray2 = fileArray.listFiles()).length) > (n3 = 1)) {
            fileArray2 = null;
            long l2 = bm.H((File)fileArray, false);
            for (File file : fileArray.listFiles()) {
                String string2;
                String string3 = file.getName();
                boolean bl2 = string3.equals(string2 = String.valueOf(l2));
                if (bl2 || (bl2 = (string3 = file.getName()).equals(string2 = "stale.tmp"))) continue;
                bm.Q(file);
            }
        }
    }

    private static boolean Q(File file) {
        boolean bl2;
        File[] fileArray = file.listFiles();
        int n3 = 1;
        if (fileArray != null) {
            int n4;
            for (int i3 = 0; i3 < (n4 = fileArray.length); ++i3) {
                File file2 = fileArray[i3];
                n4 = (int)(bm.Q(file2) ? 1 : 0);
                n3 &= n4;
            }
        }
        if (!(bl2 = file.delete())) {
            return false;
        }
        return n3 != 0;
    }

    public final void A(String object, int n3, long l2, int n4) {
        object = this.J((String)object, n3, l2);
        Properties properties = new Properties();
        String string2 = String.valueOf(n4);
        properties.put("numberOfMerges", string2);
        ((File)object).getParentFile().mkdirs();
        ((File)object).createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream((File)object);
        properties.store(fileOutputStream, null);
        ((OutputStream)fileOutputStream).close();
    }

    public final void B(String fileArray, int n3, long l2) {
        int n4 = ((File)(fileArray = this.I((String)fileArray))).exists();
        if (n4 != 0) {
            for (File file : ((File)fileArray).listFiles()) {
                String string2;
                String string3 = file.getName();
                int n7 = string3.equals(string2 = String.valueOf(n3));
                if (n7 == 0 && (n7 = (string3 = file.getName()).equals(string2 = "stale.tmp")) == 0) {
                    bm.Q(file);
                    continue;
                }
                string3 = file.getName();
                n7 = string3.equals(string2 = String.valueOf(n3));
                if (n7 == 0) continue;
                File[] fileArray2 = file.listFiles();
                n7 = fileArray2.length;
                string2 = null;
                for (int i3 = 0; i3 < n7; ++i3) {
                    String string4;
                    File file2 = fileArray2[i3];
                    String string5 = file2.getName();
                    boolean bl2 = string5.equals(string4 = String.valueOf(l2));
                    if (bl2) continue;
                    bm.Q(file2);
                }
            }
        }
    }

    public final void C(List list) {
        boolean bl2;
        et et2 = this.e;
        int n3 = et2.a();
        Iterator iterator = this.O().iterator();
        while (bl2 = iterator.hasNext()) {
            long l2;
            long l3;
            long l4;
            long l7;
            File file = (File)iterator.next();
            String string2 = file.getName();
            boolean bl3 = list.contains(string2);
            if (bl3 || (l7 = (l4 = (l3 = bm.H(file, bl3 = true)) - (l2 = (long)n3)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            bm.Q(file);
        }
    }

    public final boolean D(String string2) {
        File file = this.I(string2);
        boolean bl2 = file.exists();
        if (!bl2) {
            return true;
        }
        return bm.Q(this.I(string2));
    }

    public final boolean E(String string2, int n3, long l2) {
        File file = this.K(string2, n3, l2);
        boolean bl2 = file.exists();
        if (!bl2) {
            return true;
        }
        return bm.Q(this.K(string2, n3, l2));
    }

    public final boolean F(String string2, int n3, long l2) {
        File file = this.h(string2, n3, l2);
        boolean bl2 = file.exists();
        if (!bl2) {
            return true;
        }
        return bm.Q(this.h(string2, n3, l2));
    }

    public final boolean G(String string2) {
        try {
            string2 = this.r(string2);
            if (string2 != null) {
                return true;
            }
        }
        catch (IOException iOException) {}
        return false;
    }

    public final int a(String string2) {
        return (int)bm.H(this.I(string2), true);
    }

    public final int b(String object, int n3, long l2) {
        String string2;
        Object object2;
        block9: {
            if ((n3 = (int)(((File)(object = this.J((String)object, n3, l2))).exists() ? 1 : 0)) == 0) {
                return 0;
            }
            Serializable serializable = new Properties();
            object2 = new FileInputStream((File)object);
            serializable.load((InputStream)object2);
            object = "numberOfMerges";
            object2 = serializable.getProperty((String)object);
            string2 = "Merge checkpoint file corrupt.";
            if (object2 == null) break block9;
            try {
                object = serializable.getProperty((String)object);
            }
            catch (NumberFormatException numberFormatException) {
                serializable = new cz(string2, numberFormatException);
                throw serializable;
            }
            return Integer.parseInt((String)object);
        }
        object = new cz(string2);
        throw object;
        finally {
            ((InputStream)object2).close();
        }
    }

    public final long c(String string2) {
        File file = this.I(string2);
        boolean bl2 = true;
        int n3 = (int)bm.H(file, bl2);
        return bm.H(this.g(string2, n3), bl2);
    }

    public final AssetLocation d(String string2, String string3, List object) {
        boolean bl2;
        int n3 = 1;
        int n4 = 2;
        if (object == null) {
            return null;
        }
        Object object2 = new File("assets", string3);
        object2 = ((File)object2).getPath();
        Object[] objectArray = object.iterator();
        while (bl2 = objectArray.hasNext()) {
            Object object3 = (String)objectArray.next();
            try {
                if ((object3 = ce.a((String)object3, (String)object2)) == null) continue;
                return object3;
            }
            catch (IOException iOException) {
                object = a;
                Object[] objectArray2 = new Object[n4];
                objectArray2[0] = object3;
                objectArray2[n3] = string3;
                ((o)object).c(iOException, "Failed to parse APK file '%s' looking for asset '%s'.", objectArray2);
                return null;
            }
        }
        object2 = a;
        objectArray = new Object[3];
        objectArray[0] = string3;
        objectArray[n3] = string2;
        objectArray[n4] = object;
        ((o)object2).a("The asset %s is not present in Asset Pack %s. Searched in APKs: %s", objectArray);
        return null;
    }

    public final AssetLocation e(String object, String string2, AssetPackLocation object2) {
        Object[] objectArray = ((AssetPackLocation)object2).assetsPath();
        Object object3 = new File((String)objectArray, string2);
        boolean bl2 = ((File)object3).exists();
        if (bl2) {
            String string3 = ((File)object3).getPath();
            long l2 = ((File)object3).length();
            object = new bq(string3, 0L, l2);
            return object;
        }
        object3 = a;
        object2 = ((AssetPackLocation)object2).assetsPath();
        objectArray = new Object[]{string2, object, object2};
        ((o)object3).a("The asset %s is not present in Asset Pack %s. Searched in folder: %s", objectArray);
        return null;
    }

    public final AssetPackLocation f(String object) {
        object = this.r((String)object);
        String string2 = null;
        if (object == null) {
            return null;
        }
        Object[] objectArray = "assets";
        Object object2 = new File((String)object, (String)objectArray);
        boolean bl2 = ((File)object2).isDirectory();
        if (!bl2) {
            object = a;
            objectArray = new Object[]{object2};
            ((o)object).b("Failed to find assets directory: %s", objectArray);
            return null;
        }
        string2 = ((File)object2).getCanonicalPath();
        object2 = new br(0, (String)object, string2);
        return object2;
    }

    public final File g(String object, int n3) {
        object = this.I((String)object);
        String string2 = String.valueOf(n3);
        File file = new File((File)object, string2);
        return file;
    }

    public final File h(String object, int n3, long l2) {
        object = this.g((String)object, n3);
        String string2 = String.valueOf(l2);
        File file = new File((File)object, string2);
        return file;
    }

    public final File i(String object, int n3, long l2) {
        object = this.h((String)object, n3, l2);
        File file = new File((File)object, "_metadata");
        return file;
    }

    public final File j(String object, int n3, long l2) {
        object = this.K((String)object, n3, l2);
        File file = new File((File)object, "_packs");
        return file;
    }

    public final File k(String object, int n3, long l2) {
        object = this.i((String)object, n3, l2);
        File file = new File((File)object, "properties.dat");
        return file;
    }

    public final File l(String object, int n3, long l2) {
        object = this.K((String)object, n3, l2);
        File file = new File((File)object, "_slices");
        File file2 = new File(file, "_metadata");
        return file2;
    }

    public final File m(String object, int n3, long l2, String string2) {
        object = this.o((String)object, n3, l2, string2);
        File file = new File((File)object, "checkpoint_ext.dat");
        return file;
    }

    public final File n(String object, int n3, long l2, String string2) {
        object = this.o((String)object, n3, l2, string2);
        File file = new File((File)object, "checkpoint.dat");
        return file;
    }

    public final File o(String object, int n3, long l2, String string2) {
        object = this.l((String)object, n3, l2);
        File file = new File((File)object, string2);
        return file;
    }

    public final File p(String object, int n3, long l2, String string2) {
        object = this.K((String)object, n3, l2);
        File file = new File((File)object, "_slices");
        File file2 = new File(file, "_unverified");
        File file3 = new File(file2, string2);
        return file3;
    }

    public final File q(String object, int n3, long l2, String string2) {
        object = this.K((String)object, n3, l2);
        File file = new File((File)object, "_slices");
        File file2 = new File(file, "_verified");
        File file3 = new File(file2, string2);
        return file3;
    }

    public final String r(String string2) {
        int n3;
        int n32 = 2;
        int n4 = 1;
        Object object = this.L();
        Object object2 = new File((File)object, string2);
        boolean n7 = ((File)object2).exists();
        if (!n7) {
            o objectArray = a;
            Object[] objectArray2 = new Object[n4];
            objectArray2[0] = string2;
            objectArray.a("Pack not found with pack name: %s", objectArray2);
            return null;
        }
        object = this.e;
        int n8 = ((et)object).a();
        File file = new File((File)object2, (String)(object = String.valueOf(n8)));
        boolean bl2 = file.exists();
        if (!bl2) {
            object2 = a;
            object = this.e.a();
            Object[] objectArray = new Object[n32];
            objectArray[0] = string2;
            objectArray[n4] = object;
            ((o)object2).a("Pack not found with pack name: %s app version: %s", objectArray);
            return null;
        }
        object2 = file.listFiles();
        if (object2 != null && (n3 = ((File[])object2).length) != 0) {
            if (n3 > n4) {
                object2 = a;
                object = this.e.a();
                Object[] objectArray = new Object[n32];
                objectArray[0] = string2;
                objectArray[n4] = object;
                ((o)object2).b("Multiple pack versions found for pack name: %s app version: %s", objectArray);
                return null;
            }
            return object2[0].getCanonicalPath();
        }
        object2 = a;
        object = this.e.a();
        Object[] objectArray = new Object[n32];
        objectArray[0] = string2;
        objectArray[n4] = object;
        ((o)object2).a("No pack version found for pack name: %s app version: %s", objectArray);
        return null;
    }

    public final List s(String object) {
        String[] stringArray;
        Object object2;
        int n3 = 1;
        String string2 = null;
        String string3 = null;
        Object object3 = this.d;
        object3 = object3.getPackageManager();
        Object object4 = this.d;
        object4 = object4.getPackageName();
        try {
            object3 = object3.getPackageInfo((String)object4, 0);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object3 = a;
            object4 = new Context[]{};
            object2 = "Could not find PackageInfo.";
            ((o)object3).b((String)object2, (Object[])object4);
            object3 = null;
        }
        if (object3 == null) {
            return null;
        }
        object4 = new ArrayList();
        object2 = ((PackageInfo)object3).splitNames;
        if (object2 != null && (stringArray = ((PackageInfo)object3).applicationInfo.splitSourceDirs) != null) {
            int n4 = Arrays.binarySearch((Object[])object2, object);
            if (n4 < 0) {
                object2 = a;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                string2 = "Asset Pack '%s' is not installed.";
                ((o)object2).a(string2, objectArray);
            } else {
                String[] stringArray2 = ((PackageInfo)object3).applicationInfo.splitSourceDirs;
                string3 = stringArray2[n4];
            }
        } else {
            object2 = a;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            string2 = "No splits present for package %s.";
            ((o)object2).a(string2, objectArray);
        }
        if (string3 == null) {
            object = ((PackageInfo)object3).applicationInfo.sourceDir;
            ((ArrayList)object4).add(object);
            object = bm.N((PackageInfo)object3, "config.");
            ((ArrayList)object4).addAll(object);
            return object4;
        }
        ((ArrayList)object4).add(string3);
        object = String.valueOf(object).concat(".config.");
        object = bm.N((PackageInfo)object3, (String)object);
        ((ArrayList)object4).addAll(object);
        return object4;
    }

    public final Map t() {
        boolean bl2;
        HashMap<String, File> hashMap = new HashMap<String, File>();
        Iterator iterator = this.O().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = ((File)iterator.next()).getName();
            Comparable<File> comparable = this.I(string2);
            boolean bl3 = true;
            long l2 = bm.H(comparable, bl3);
            int n3 = (int)l2;
            File file = this.g(string2, n3);
            long l3 = bm.H(file, bl3);
            comparable = this.h(string2, n3, l3);
            if ((n3 = (int)(comparable.exists() ? 1 : 0)) == 0) continue;
            comparable = l3;
            hashMap.put(string2, (File)comparable);
        }
        return hashMap;
    }

    public final Map u() {
        boolean bl2;
        HashMap<String, Long> hashMap = new HashMap<String, Long>();
        Iterator iterator = this.v().keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            long l2 = this.c(string2);
            Long l3 = l2;
            hashMap.put(string2, l3);
        }
        return hashMap;
    }

    public final Map v() {
        Object object;
        Object object2;
        HashMap<Object, Object[]> hashMap = new HashMap<Object, Object[]>();
        Object object3 = this.O();
        try {
            object3 = object3.iterator();
        }
        catch (IOException iOException) {
            object2 = a;
            int n3 = 1;
            object = new Object[n3];
            object[0] = iOException;
            String string2 = "Could not process directory while scanning installed packs: %s";
            ((o)object2).b(string2, object);
        }
        while (true) {
            boolean bl2 = object3.hasNext();
            if (!bl2) break;
            object2 = object3.next();
            object2 = (File)object2;
            object = ((File)object2).getName();
            if ((object = this.f((String)object)) == null) continue;
            object2 = ((File)object2).getName();
            hashMap.put(object2, (Object[])object);
            continue;
            break;
        }
        return hashMap;
    }

    public final void w() {
        boolean bl2;
        Iterator iterator = this.O().iterator();
        while (bl2 = iterator.hasNext()) {
            Object[] objectArray;
            File[] fileArray = (File[])iterator.next();
            File[] fileArray2 = fileArray.listFiles();
            if (fileArray2 == null) continue;
            bm.P((File)fileArray);
            int n3 = 0;
            fileArray2 = null;
            long l2 = bm.H((File)fileArray, false);
            Object object = this.e;
            int n4 = ((et)object).a();
            long l3 = n4;
            long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (l4 != false) {
                Object object2 = String.valueOf(l2);
                File file = new File((File)fileArray, (String)object2);
                object2 = "stale.tmp";
                object = new File(file, (String)object2);
                try {
                    ((File)object).createNewFile();
                }
                catch (IOException iOException) {
                    object2 = a;
                    objectArray = new Object[]{};
                    object = "Could not write staleness marker.";
                    ((o)object2).b((String)object, objectArray);
                }
            }
            fileArray = fileArray.listFiles();
            int n7 = fileArray.length;
            while (n3 < n7) {
                objectArray = fileArray[n3];
                bm.P((File)objectArray);
                ++n3;
            }
        }
    }

    public final void x() {
        File[] fileArray = this.M();
        boolean bl2 = fileArray.exists();
        if (bl2) {
            for (File file : this.M().listFiles()) {
                long l2 = System.currentTimeMillis();
                long l3 = file.lastModified();
                long l4 = (l2 -= l3) - (l3 = b);
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object > 0) {
                    bm.Q(file);
                    continue;
                }
                bm.P(file);
            }
        }
    }

    public final void y() {
        boolean bl2;
        Iterator iterator = this.O().iterator();
        while (bl2 = iterator.hasNext()) {
            File[] fileArray = (File[])iterator.next();
            File[] fileArray2 = fileArray.listFiles();
            if (fileArray2 == null) continue;
            for (File file : fileArray.listFiles()) {
                String string2 = "stale.tmp";
                File file2 = new File(file, string2);
                boolean bl3 = file2.exists();
                if (!bl3) continue;
                long l2 = System.currentTimeMillis();
                long l3 = file2.lastModified();
                long l4 = (l2 -= l3) - (l3 = c);
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object <= 0) continue;
                bm.Q(file);
            }
        }
    }

    public final void z() {
        bm.Q(this.L());
    }
}

