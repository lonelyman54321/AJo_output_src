/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from F91
 */
public final class f91_0 {
    public static final f91_0 a;
    public static final ff_2 b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;

    static {
        Object object;
        int n3 = 8;
        int n4 = 1;
        Object[] objectArray = new f91_0();
        a = objectArray;
        objectArray = ff_2.d;
        b = ff$a_0.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        String string2 = "PING";
        String string3 = "GOAWAY";
        Object object2 = "RST_STREAM";
        Object object3 = "SETTINGS";
        Object object4 = "PUSH_PROMISE";
        CharSequence charSequence = "WINDOW_UPDATE";
        Object object5 = "CONTINUATION";
        c = new String[]{"DATA", "HEADERS", "PRIORITY", object2, object3, object4, string2, string3, charSequence, object5};
        objectArray = new String[64];
        d = objectArray;
        int n7 = 256;
        Object object6 = new String[n7];
        int n8 = 0;
        Object object7 = 0;
        String string4 = null;
        while (true) {
            object = 32;
            if (object7 >= n7) break;
            object3 = Integer.toBinaryString(object7);
            Intrinsics.checkNotNullExpressionValue(object3, "toBinaryString(it)");
            object4 = new Object[n4];
            object4[0] = object3;
            object3 = ez3.i("%8s", object4);
            char c2 = '0';
            object2 = kotlin.text.b.o((String)object3, (char)object, c2);
            object6[object7] = object2;
            object7 += n4;
        }
        e = object6;
        objectArray = d;
        objectArray[0] = "";
        objectArray[n4] = "END_STREAM";
        object6 = new int[]{n4};
        objectArray[n3] = "PADDED";
        object7 = object6[0];
        Object object8 = object7 | 8;
        object4 = new StringBuilder();
        string4 = objectArray[object7];
        string2 = "|PADDED";
        objectArray[object8] = string4 = h30_0.a((StringBuilder)object4, string4, string2);
        object7 = 4;
        objectArray[object7] = "END_HEADERS";
        object3 = "PRIORITY";
        objectArray[object] = object3;
        object8 = 36;
        objectArray[object8] = object4 = "END_HEADERS|PRIORITY";
        objectArray = new int[]{object7, object, object8};
        string4 = null;
        for (object7 = 0; object7 < (object = 3); object7 += n4) {
            object = objectArray[object7];
            object8 = object6[0];
            object4 = d;
            int n10 = object8 | object;
            charSequence = new StringBuilder();
            object5 = object4[object8];
            ((StringBuilder)charSequence).append((String)object5);
            char c3 = '|';
            ((StringBuilder)charSequence).append(c3);
            Object object9 = object4[object];
            ((StringBuilder)charSequence).append((String)object9);
            charSequence = ((StringBuilder)charSequence).toString();
            object4[n10] = charSequence;
            n10 |= n3;
            charSequence = new StringBuilder();
            object3 = object4[object8];
            ((StringBuilder)charSequence).append((String)object3);
            ((StringBuilder)charSequence).append(c3);
            object2 = object4[object];
            object4[n10] = object2 = h30_0.a((StringBuilder)charSequence, (String)object2, string2);
        }
        String[] stringArray = d;
        n3 = stringArray.length;
        while (n8 < n3) {
            objectArray = d;
            object6 = objectArray[n8];
            if (object6 == null) {
                objectArray[n8] = object6 = e[n8];
            }
            n8 += n4;
        }
    }

    public static String a(boolean bl2, int n3, int n4, int n7, int n8) {
        Object object;
        Object object2;
        Object object3;
        int n10;
        block9: {
            Object object4;
            block10: {
                int n14;
                block11: {
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    block8: {
                        n10 = 5;
                        n18 = 3;
                        n17 = 2;
                        n16 = 4;
                        n14 = 1;
                        object3 = c;
                        int n19 = ((String[])object3).length;
                        if (n7 < n19) {
                            object3 = object3[n7];
                        } else {
                            object3 = n7;
                            object4 = new Object[n14];
                            object4[0] = object3;
                            object3 = ez3.i("0x%02x", object4);
                        }
                        if (n8 != 0) break block8;
                        object2 = "";
                        break block9;
                    }
                    object4 = e;
                    if (n7 == n17 || n7 == n18) break block10;
                    if (n7 == n16 || n7 == (n15 = 6)) break block11;
                    n15 = 7;
                    if (n7 == n15 || n7 == (n15 = 8)) break block10;
                    String[] stringArray = d;
                    int n20 = stringArray.length;
                    if (n8 < n20) {
                        object4 = stringArray[n8];
                        Intrinsics.checkNotNull(object4);
                    } else {
                        object4 = object4[n8];
                    }
                    if (n7 == n10 && (n15 = n8 & 4) != 0) {
                        object = "PUSH_PROMISE";
                        object2 = kotlin.text.b.n((String)object4, "HEADERS", (String)object, false);
                    } else if (n7 == 0 && (n7 = n8 & 0x20) != 0) {
                        object = "COMPRESSED";
                        object2 = kotlin.text.b.n((String)object4, "PRIORITY", (String)object, false);
                    } else {
                        object2 = object4;
                    }
                    break block9;
                }
                object2 = n8 == n14 ? "ACK" : object4[n8];
                break block9;
            }
            object2 = object4[n8];
        }
        String string2 = bl2 ? "<<" : ">>";
        Integer n21 = n3;
        Integer n22 = n4;
        object = new Object[n10];
        object[0] = string2;
        object[n14] = n21;
        object[n17] = n22;
        object[n18] = object3;
        object[n16] = object2;
        return ez3.i("%s 0x%08x %5d %-13s %s", object);
    }
}

