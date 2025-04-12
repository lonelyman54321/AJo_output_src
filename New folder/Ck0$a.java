/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.exoplayer.source.j$b;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import java.util.AbstractCollection;

public final class Ck0$a {
    public final g$b a;
    public ImmutableList b;
    public ImmutableMap c;
    public j$b d;
    public j$b e;
    public j$b f;

    public Ck0$a(g$b object) {
        this.a = object;
        this.b = object = ImmutableList.of();
        this.c = object = ImmutableMap.of();
    }

    public static j$b b(f f5, ImmutableList immutableList, j$b j$b, g$b g$b) {
        boolean bl2;
        int n3;
        int n4;
        boolean bl3;
        int n7;
        Object object;
        Object object2 = f5.getCurrentTimeline();
        int n8 = f5.getCurrentPeriodIndex();
        boolean bl4 = ((g)object2).q();
        if (bl4) {
            bl4 = false;
            object = null;
        } else {
            object = ((g)object2).m(n8);
        }
        boolean bl5 = f5.isPlayingAd();
        if (!bl5 && !(bl5 = ((g)object2).q())) {
            object2 = ((g)object2).f(n8, g$b);
            long l2 = gz3.I(f5.getCurrentPosition());
            long l3 = g$b.g();
            n7 = ((g$b)object2).b(l2 -= l3);
        } else {
            n7 = -1;
        }
        object2 = null;
        for (int i3 = 0; i3 < (n8 = immutableList.size()); ++i3) {
            j$b j$b2 = (j$b)immutableList.get(i3);
            bl5 = Ck0$a.c(j$b2, object, bl3 = f5.isPlayingAd(), n4 = f5.getCurrentAdGroupIndex(), n3 = f5.getCurrentAdIndexInAdGroup(), n7);
            if (!bl5) continue;
            return j$b2;
        }
        boolean bl6 = immutableList.isEmpty();
        if (bl6 && j$b != null && (bl2 = Ck0$a.c(j$b, object, bl3 = f5.isPlayingAd(), n4 = f5.getCurrentAdGroupIndex(), n3 = f5.getCurrentAdIndexInAdGroup(), n7))) {
            return j$b;
        }
        return null;
    }

    public static boolean c(j$b j$b, Object object, boolean n3, int n4, int n7, int n8) {
        int n10;
        int n14 = j$b.a.equals(object);
        boolean bl2 = false;
        if (n14 == 0) {
            return false;
        }
        n14 = j$b.b;
        if (n3 != 0 && n14 == n4 && (n4 = j$b.c) == n7 || n3 == 0 && n14 == (n3 = -1) && (n10 = j$b.e) == n8) {
            bl2 = true;
        }
        return bl2;
    }

    public final void a(ImmutableMap$Builder immutableMap$Builder, j$b j$b, g g3) {
        int n3;
        if (j$b == null) {
            return;
        }
        Object object = j$b.a;
        int n4 = g3.b(object);
        if (n4 != (n3 = -1)) {
            immutableMap$Builder.put(j$b, g3);
        } else {
            g3 = (g)this.c.get(j$b);
            if (g3 != null) {
                immutableMap$Builder.put(j$b, g3);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void d(g object) {
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        Object object2 = this.b;
        boolean n3 = ((AbstractCollection)object2).isEmpty();
        if (n3) {
            boolean bl2;
            boolean bl3;
            object2 = this.e;
            this.a(immutableMap$Builder, (j$b)object2, (g)object);
            object2 = this.f;
            j$b j$b = this.e;
            boolean bl4 = Objects.equal(object2, j$b);
            if (!bl4) {
                object2 = this.f;
                this.a(immutableMap$Builder, (j$b)object2, (g)object);
            }
            if (!(bl3 = Objects.equal(object2 = this.d, j$b = this.e)) && !(bl2 = Objects.equal(object2 = this.d, j$b = this.f))) {
                object2 = this.d;
                this.a(immutableMap$Builder, (j$b)object2, (g)object);
            }
        } else {
            Object object3;
            int n4;
            void var4_9;
            boolean bl5 = false;
            object2 = null;
            while (var4_9 < (n4 = ((AbstractCollection)(object3 = this.b)).size())) {
                object3 = (j$b)this.b.get((int)var4_9);
                this.a(immutableMap$Builder, (j$b)object3, (g)object);
                ++var4_9;
            }
            object2 = this.b;
            object3 = this.d;
            boolean bl6 = ((ImmutableList)object2).contains(object3);
            if (!bl6) {
                object2 = this.d;
                this.a(immutableMap$Builder, (j$b)object2, (g)object);
            }
        }
        this.c = object = immutableMap$Builder.buildOrThrow();
    }
}

