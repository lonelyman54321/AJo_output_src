/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.source.i;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;

/*
 * Renamed from qO1
 */
public final class qo1_0
implements Function {
    public final Object apply(Object object) {
        object = ((i)object).l();
        rp3 rp32 = new Object();
        return ImmutableList.copyOf((Collection)Lists.transform(((sp3)object).b, rp32));
    }
}

