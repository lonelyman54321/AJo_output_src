/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;

/*
 * Renamed from GV0
 */
public final class gv0_0
implements Function {
    public final Object apply(Object object) {
        object = (fp1_0)object;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = ((fp1_0)object).a;
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        object = ((fp1_0)object).b;
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

