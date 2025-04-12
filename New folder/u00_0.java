/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from u00
 */
public abstract class u00_0 {
    public final void a(h00_0 h00_02) {
        Object object = "observer is null";
        x03_0.b(h00_02, (String)object);
        try {
            this.b(h00_02);
            return;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
            object = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            ((Throwable)object).initCause(throwable);
            throw object;
        }
        catch (NullPointerException nullPointerException) {
            throw nullPointerException;
        }
    }

    public abstract void b(h00_0 var1);
}

