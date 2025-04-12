/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from Ym1
 */
public final class ym1_1 {
    public static final String a(String string2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string3 = "name";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = jSONObject.has(string2);
        string2 = bl2 ? jSONObject.getString(string2) : null;
        return string2;
    }

    public static fo1_1 b(MappedByteBuffer object) {
        object = ((ByteBuffer)object).duplicate();
        Object object2 = ByteOrder.BIG_ENDIAN;
        ((ByteBuffer)object).order((ByteOrder)object2);
        int n3 = ((Buffer)object).position() + 4;
        ((ByteBuffer)object).position(n3);
        n3 = ((ByteBuffer)object).getShort() & (char)-1;
        int n4 = 100;
        String string2 = "Cannot read metadata.";
        if (n3 <= n4) {
            long l2;
            long l3;
            long l4;
            int n7;
            ByteOrder byteOrder;
            block6: {
                n4 = ((Buffer)object).position() + 6;
                ((ByteBuffer)object).position(n4);
                n4 = 0;
                byteOrder = null;
                n7 = 0;
                while (true) {
                    l4 = 0xFFFFFFFFL;
                    l3 = -1;
                    if (n7 >= n3) break;
                    int n8 = ((ByteBuffer)object).getInt();
                    int n10 = ((Buffer)object).position() + 4;
                    ((ByteBuffer)object).position(n10);
                    n10 = ((ByteBuffer)object).getInt();
                    l2 = (long)n10 & l4;
                    int n14 = ((Buffer)object).position() + 4;
                    ((ByteBuffer)object).position(n14);
                    n14 = 1835365473;
                    if (n14 != n8) {
                        ++n7;
                        continue;
                    }
                    break block6;
                    break;
                }
                l2 = l3;
            }
            n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n3 != 0) {
                long l7;
                long l8;
                l3 = ((Buffer)object).position();
                n3 = (int)(l2 - l3);
                n7 = ((Buffer)object).position() + n3;
                ((ByteBuffer)object).position(n7);
                n3 = ((Buffer)object).position() + 12;
                ((ByteBuffer)object).position(n3);
                n3 = ((ByteBuffer)object).getInt();
                l3 = (long)n3 & l4;
                while ((n3 = (int)((l8 = (l7 = (long)n4) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1))) < 0) {
                    n3 = ((ByteBuffer)object).getInt();
                    l7 = (long)((ByteBuffer)object).getInt() & l4;
                    ((ByteBuffer)object).getInt();
                    n7 = 1164798569;
                    if (n7 != n3 && (n7 = 1701669481) != n3) {
                        ++n4;
                        continue;
                    }
                    n3 = (int)(l7 + l2);
                    ((ByteBuffer)object).position(n3);
                    object2 = new di3_1();
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                    ((ByteBuffer)object).order(byteOrder);
                    n4 = ((Buffer)object).position();
                    n4 = ((ByteBuffer)object).getInt(n4);
                    int n15 = ((Buffer)object).position() + n4;
                    ((di3_1)object2).b = object;
                    ((di3_1)object2).a = n15;
                    int n16 = ((ByteBuffer)object).getInt(n15);
                    ((di3_1)object2).c = n15 -= n16;
                    ((di3_1)object2).d = n16 = (int)((di3_1)object2).b.getShort(n15);
                    return object2;
                }
            }
            object = new IOException(string2);
            throw object;
        }
        object = new IOException(string2);
        throw object;
    }

    public static final Object c(fo0 object, aG2 object2, f80_0 f80_02) {
        Object object3 = object.e();
        boolean bl2 = ((LP1$c)object3).m;
        if (!bl2) {
            object = Unit.a;
        } else {
            object3 = go0.e((fo0)object);
            Object object4 = object.e();
            boolean bl3 = ((LP1$c)object4).m;
            if (!bl3) {
                object = null;
            } else {
                object4 = QD.p;
                if ((object4 = (JD)((Object)Zr3.a((fo0)object, object4))) == null) {
                    object4 = new TD((fo0)object);
                }
                object = object4;
            }
            if (object == null) {
                object = Unit.a;
            } else {
                object4 = new lt2_0((aG2)object2, (w32_0)object3);
                if ((object = object.Q((w32_0)object3, (Function0)object4, f80_02)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
                    object = Unit.a;
                }
            }
        }
        return object;
    }
}

