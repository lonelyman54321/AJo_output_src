/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from s70
 */
public final class s70_0 {
    public static void a(String string2, boolean bl2) {
        if (bl2) {
            return;
        }
        throw ParserException.a(string2, null);
    }

    public static final yn1_2 b(SerialDescriptor object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof v70_0;
        object = bl2 ? ((v70_0)object).b : ((bl2 = object instanceof mz2_2) ? s70_0.b(((mz2_2)object).a) : null);
        return object;
    }
}

