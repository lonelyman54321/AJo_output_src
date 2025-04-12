/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.exoplayer.source.e;
import com.google.common.base.Supplier;

public final class qm0
implements Supplier {
    public final /* synthetic */ Class a;
    public final /* synthetic */ DataSource$Factory b;

    public /* synthetic */ qm0(Class clazz, DataSource$Factory dataSource$Factory) {
        this.a = clazz;
        this.b = dataSource$Factory;
    }

    public final Object get() {
        Class clazz = this.a;
        DataSource$Factory dataSource$Factory = this.b;
        return e.g(clazz, dataSource$Factory);
    }
}

