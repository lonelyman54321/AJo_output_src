/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.nsd.NsdManager
 *  android.net.nsd.NsdManager$RegistrationListener
 *  android.net.nsd.NsdServiceInfo
 */
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.FacebookSdk;
import java.util.AbstractCollection;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class Qp0 {
    public static final Qp0 a;
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        b = hashMap = new HashMap();
    }

    public static final void a(String string2) {
        Qp0 qp0;
        Class<Qp0> clazz = Qp0.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        try {
            qp0 = a;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return;
        }
        qp0.b(string2);
    }

    public static final boolean c() {
        Throwable throwable2;
        Class<Qp0> clazz;
        block8: {
            boolean bl2;
            block7: {
                Object object;
                clazz = Qp0.class;
                boolean bl3 = td0.b(clazz);
                bl2 = false;
                if (bl3) {
                    return false;
                }
                try {
                    object = FacebookSdk.b();
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object = dl0_2.b((String)object);
                if (object == null) break block7;
                object = ((al0_2)object).e;
                y73_0 y73_02 = y73_0.Enabled;
                boolean bl4 = ((AbstractCollection)object).contains((Object)y73_02);
                if (!bl4) break block7;
                bl2 = true;
            }
            return bl2;
        }
        td0.a(clazz, throwable2);
        return false;
    }

    /*
     * Exception decompiling
     */
    public final void b(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [8 : 84->87)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean d(String string2) {
        boolean bl2;
        int n3;
        HashMap hashMap;
        String string3;
        String string4;
        block25: {
            string4 = "fbsdk_";
            string3 = "android-";
            boolean bl3 = td0.b(this);
            if (bl3) {
                return false;
            }
            try {
                hashMap = b;
            }
            catch (Throwable throwable) {
                td0.a(this, throwable);
                return false;
            }
            n3 = hashMap.containsKey(string2);
            bl2 = true;
            if (n3 == 0) break block25;
            return bl2;
        }
        Object object = FacebookSdk.a;
        object = "18.0.2";
        char c2 = '.';
        char c3 = '|';
        object = kotlin.text.b.o((String)object, c2, c3);
        Object object2 = new StringBuilder(string3);
        ((StringBuilder)object2).append((String)object);
        string3 = ((StringBuilder)object2).toString();
        object = new StringBuilder(string4);
        ((StringBuilder)object).append(string3);
        char c5 = '_';
        ((StringBuilder)object).append(c5);
        ((StringBuilder)object).append(string2);
        string4 = ((StringBuilder)object).toString();
        string3 = new NsdServiceInfo();
        object = "_fb._tcp.";
        string3.setServiceType((String)object);
        string3.setServiceName(string4);
        n3 = 80;
        string3.setPort(n3);
        object = FacebookSdk.a();
        object2 = "servicediscovery";
        object = object.getSystemService((String)object2);
        object2 = "null cannot be cast to non-null type android.net.nsd.NsdManager";
        Intrinsics.checkNotNull(object, (String)object2);
        object = (NsdManager)object;
        object2 = new Qp0$a(string4, string2);
        hashMap.put(string2, object2);
        object.registerService((NsdServiceInfo)string3, (int)(bl2 ? 1 : 0), (NsdManager.RegistrationListener)object2);
        return bl2;
    }
}

