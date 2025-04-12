/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.source.m;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * Renamed from FE
 */
public final class fe_0
implements m {
    public final hi0_0 a;
    public eI0 b;
    public il0_0 c;

    public fe_0(hi0_0 hi0_02) {
        this.a = hi0_02;
    }

    public final long a() {
        il0_0 il0_02 = this.c;
        long l2 = il0_02 != null ? il0_02.d : (long)-1;
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(DataSource object, Uri object2, Map object3, long l2, long l3, gi0_0 object4) {
        block16: {
            Object object5;
            int n3;
            int n4;
            il0_0 il0_02;
            long l4;
            block15: {
                l4 = l2;
                this.c = il0_02 = new il0_0((DataSource)object, l2, l3);
                object = this.b;
                if (object != null) {
                    return;
                }
                object = this.a.c((Uri)object2, (Map)object3);
                int n7 = ((eI0[])object).length;
                object3 = ImmutableList.builderWithExpectedSize(n7);
                n4 = ((eI0[])object).length;
                n3 = 1;
                if (n4 != n3) break block15;
                object = object[0];
                this.b = object;
                break block16;
            }
            n4 = ((eI0[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                boolean bl2;
                block17: {
                    long l7;
                    long l8;
                    Object object6;
                    block14: {
                        long l12;
                        long l14;
                        Throwable throwable2;
                        block13: {
                            block12: {
                                block11: {
                                    object6 = object[i3];
                                    try {
                                        long l15;
                                        boolean bl3 = object6.b(il0_02);
                                        if (bl3) {
                                            this.b = object6;
                                            il0_02.f = 0;
                                            break;
                                        }
                                        object6 = object6.i();
                                        ((ImmutableList$Builder)object3).addAll((Iterable)object6);
                                        object6 = this.b;
                                        if (object6 == null && (l8 = (l15 = (l4 = il0_02.d) - l2) == 0L ? 0 : (l15 < 0L ? -1 : 1)) != false) break block11;
                                        break block12;
                                    }
                                    catch (Throwable throwable2) {
                                        break block13;
                                    }
                                    catch (EOFException eOFException) {
                                        break block14;
                                    }
                                }
                                bl2 = false;
                                object6 = null;
                                break block17;
                            }
                            bl2 = true;
                            break block17;
                        }
                        object2 = this.b;
                        if (object2 == null && (n4 = (l14 = (l12 = il0_02.d) - l2) == 0L ? 0 : (l14 < 0L ? -1 : 1)) != 0) {
                            n3 = 0;
                        }
                        ct3.f(n3 != 0);
                        il0_02.f = 0;
                        throw throwable2;
                    }
                    object6 = this.b;
                    if (object6 == null && (l8 = (l7 = (l4 = il0_02.d) - l2) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
                        bl2 = false;
                        object6 = null;
                    } else {
                        bl2 = true;
                    }
                }
                ct3.f(bl2);
                il0_02.f = 0;
            }
            if ((object5 = this.b) == null) {
                StringBuilder stringBuilder = new StringBuilder("None of the available extractors (");
                Joiner joiner = Joiner.on(", ");
                object = ImmutableList.copyOf(object);
                object4 = new Object();
                object = Lists.transform((List)object, (Function)object4);
                object = joiner.join((Iterable)object);
                stringBuilder.append((String)object);
                stringBuilder.append(") could read the stream.");
                object = stringBuilder.toString();
                object2.getClass();
                object2 = ((ImmutableList$Builder)object3).build();
                object5 = new ParserException((String)object, null, false, n3);
                ImmutableList.copyOf((Collection)object2);
                throw object5;
            }
        }
        this.b.k((gi0_0)object4);
    }
}

