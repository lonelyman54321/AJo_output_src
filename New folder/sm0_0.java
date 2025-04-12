/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.exoplayer.source.e$a;
import androidx.media3.exoplayer.source.o$b;
import com.google.common.base.Supplier;

/*
 * Renamed from sm0
 */
public final class sm0_0
implements Supplier {
    public final /* synthetic */ e$a a;
    public final /* synthetic */ DataSource$Factory b;

    public /* synthetic */ sm0_0(e$a e$a, DataSource$Factory dataSource$Factory) {
        this.a = e$a;
        this.b = dataSource$Factory;
    }

    public final Object get() {
        hi0_0 hi0_02 = this.a.a;
        DataSource$Factory dataSource$Factory = this.b;
        o$b o$b = new o$b(dataSource$Factory, hi0_02);
        return o$b;
    }
}

