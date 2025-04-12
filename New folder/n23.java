/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public abstract class n23 {
    private final FP2 database;
    private final AtomicBoolean lock;
    private final rq1_2 stmt$delegate;

    public n23(FP2 object) {
        Intrinsics.checkNotNullParameter(object, "database");
        this.database = object;
        this.lock = object = new AtomicBoolean(false);
        object = new n23$a(this);
        this.stmt$delegate = object = yr1_2.b((Function0)object);
    }

    public static final /* synthetic */ bg3_0 access$createNewStatement(n23 n232) {
        return n232.createNewStatement();
    }

    private final bg3_0 createNewStatement() {
        String string2 = this.createQuery();
        return this.database.compileStatement(string2);
    }

    private final bg3_0 getStmt() {
        return (bg3_0)this.stmt$delegate.getValue();
    }

    private final bg3_0 getStmt(boolean bl2) {
        bg3_0 bg3_02 = bl2 ? this.getStmt() : this.createNewStatement();
        return bg3_02;
    }

    public bg3_0 acquire() {
        this.assertNotMainThread();
        boolean bl2 = this.lock.compareAndSet(false, true);
        return this.getStmt(bl2);
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(bg3_0 object) {
        Intrinsics.checkNotNullParameter(object, "statement");
        bg3_0 bg3_02 = this.getStmt();
        if (object == bg3_02) {
            object = this.lock;
            bg3_02 = null;
            ((AtomicBoolean)object).set(false);
        }
    }
}

