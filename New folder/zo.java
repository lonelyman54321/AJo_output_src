/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public final class zo
extends k0_0 {
    public final Metadata Q(do1_2 do1_22, ByteBuffer byteBuffer) {
        int n3 = byteBuffer.get();
        int n4 = 116;
        Metadata metadata = null;
        if (n3 == n4) {
            int n7;
            byte[] byArray = byteBuffer.array();
            int n8 = byteBuffer.limit();
            Vm2 vm2 = new Vm2(byArray, n8);
            n4 = 12;
            vm2.o(n4);
            n8 = vm2.g(n4);
            int n10 = vm2.d() + n8;
            n8 = 4;
            n10 -= n8;
            vm2.o(44);
            int n14 = vm2.g(n4);
            vm2.p(n14);
            n14 = 16;
            vm2.o(n14);
            ArrayList<AppInfoTable> arrayList = new ArrayList<AppInfoTable>();
            while ((n7 = vm2.d()) < n10) {
                int n15;
                vm2.o(48);
                n7 = 8;
                int n16 = vm2.g(n7);
                vm2.o(n8);
                int n17 = vm2.g(n4);
                int n18 = vm2.d() + n17;
                n17 = 0;
                String string2 = null;
                Object object = null;
                while ((n15 = vm2.d()) < n18) {
                    Object object2;
                    Object object3;
                    n15 = vm2.g(n7);
                    int n19 = vm2.g(n7);
                    int n20 = vm2.d() + n19;
                    int n21 = 2;
                    if (n15 == n21) {
                        n15 = vm2.g(n14);
                        vm2.o(n7);
                        n19 = 3;
                        if (n15 == n19) {
                            while ((n15 = vm2.d()) < n20) {
                                n17 = vm2.g(n7);
                                object3 = StandardCharsets.US_ASCII;
                                object2 = new byte[n17];
                                vm2.j(n17, (byte[])object2);
                                string2 = new String((byte[])object2, (Charset)object3);
                                n15 = vm2.g(n7);
                                object2 = null;
                                for (n19 = 0; n19 < n15; ++n19) {
                                    n21 = vm2.g(n7);
                                    vm2.p(n21);
                                }
                            }
                        }
                    } else {
                        n21 = 21;
                        if (n15 == n21) {
                            object = StandardCharsets.US_ASCII;
                            object3 = new byte[n19];
                            vm2.j(n19, (byte[])object3);
                            object = object2 = new String((byte[])object3, (Charset)object);
                        }
                    }
                    vm2.m(n20 *= 8);
                }
                vm2.m(n18 *= 8);
                if (string2 == null || object == null) continue;
                string2 = string2.concat((String)object);
                AppInfoTable appInfoTable = new AppInfoTable(n16, string2);
                arrayList.add(appInfoTable);
            }
            n3 = (int)(arrayList.isEmpty() ? 1 : 0);
            if (n3 == 0) {
                metadata = new Metadata(arrayList);
            }
        }
        return metadata;
    }
}

