/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.i_0;

/*
 * Renamed from yq1
 */
public class yq1_0 {
    public volatile wo1_1 a;
    public volatile DF b;

    static {
        i_0.a();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final wo1_1 a(wo1_1 object) {
        Object object2 = this.a;
        if (object2 != null) {
            return this.a;
        }
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block10: {
                    object2 = this.a;
                    if (object2 != null) {
                        return this.a;
                    }
                    {
                        catch (Throwable throwable2) {
                            break block9;
                        }
                        try {
                            this.a = object;
                            this.b = object2 = DF.b;
                            break block10;
                        }
                        catch (InvalidProtocolBufferException invalidProtocolBufferException) {}
                        {
                            this.a = object;
                            this.b = object = DF.b;
                        }
                    }
                }
                return this.a;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final DF b() {
        Object object = this.b;
        if (object != null) {
            return this.b;
        }
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    object = this.b;
                    if (object != null) {
                        return this.b;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object = this.a;
                if (object == null) {
                    this.b = object = DF.b;
                    return this.b;
                } else {
                    object = this.a;
                    this.b = object = object.toByteString();
                }
                return this.b;
            }
            throw throwable2;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof yq1_0;
        if (!bl2) {
            return false;
        }
        object = (yq1_0)object;
        Object object2 = this.a;
        wo1_1 wo1_12 = ((yq1_0)object).a;
        if (object2 == null && wo1_12 == null) {
            object2 = this.b();
            object = ((yq1_0)object).b();
            return ((DF)object2).equals(object);
        }
        if (object2 != null && wo1_12 != null) {
            return object2.equals(wo1_12);
        }
        if (object2 != null) {
            wo1_12 = object2.b();
            object = ((yq1_0)object).a(wo1_12);
            return object2.equals(object);
        }
        object = wo1_12.b();
        return this.a((wo1_1)object).equals(wo1_12);
    }

    public int hashCode() {
        return 1;
    }
}

