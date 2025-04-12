/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from Qn0
 */
public final class qn0_0
implements Gs3$c {
    public final List a;

    public qn0_0(List list) {
        this.a = list;
    }

    /*
     * Exception decompiling
     */
    public final Gs3 a(int var1_1, Gs3$b var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    public final List b(Gs3$b arrayList) {
        int n3;
        int n4 = 1;
        arrayList = (ArrayList<Object>)((Gs3$b)((Object)arrayList)).d;
        Xm2 xm2 = new Xm2((byte[])arrayList);
        arrayList = this.a;
        while ((n3 = xm2.a()) > 0) {
            n3 = xm2.w();
            int n7 = xm2.w();
            int n8 = xm2.b + n7;
            n7 = 134;
            if (n3 == n7) {
                arrayList = new ArrayList<Object>();
                n3 = xm2.w() & 0x1F;
                n7 = 0;
                for (int i3 = 0; i3 < n3; i3 += n4) {
                    Object object;
                    String string2;
                    Object object2;
                    Object object3 = StandardCharsets.UTF_8;
                    object3 = xm2.u(3, (Charset)object3);
                    int n10 = xm2.w();
                    int n14 = n10 & 0x80;
                    if (n14 != 0) {
                        n14 = 1;
                    } else {
                        n14 = 0;
                        object2 = null;
                    }
                    if (n14 != 0) {
                        n10 &= 0x3F;
                        string2 = "application/cea-708";
                    } else {
                        string2 = "application/cea-608";
                        n10 = 1;
                    }
                    byte by2 = (byte)xm2.w();
                    xm2.J(n4);
                    if (n14 != 0) {
                        n14 = by2 & 0x40;
                        if (n14 != 0) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            object2 = null;
                        }
                        object = LW.a;
                        if (n14 != 0) {
                            object2 = new byte[n4];
                            object2[0] = n4;
                        } else {
                            object2 = new byte[n4];
                            object2[0] = 0;
                        }
                        object2 = Collections.singletonList(object2);
                    } else {
                        n14 = 0;
                        object2 = null;
                    }
                    object = new d$a();
                    ((d$a)object).n = string2 = ip1_0.l(string2);
                    ((d$a)object).d = object3;
                    ((d$a)object).H = n10;
                    ((d$a)object).q = object2;
                    object3 = new d((d$a)object);
                    arrayList.add(object3);
                }
            }
            xm2.I(n8);
        }
        return arrayList;
    }
}

