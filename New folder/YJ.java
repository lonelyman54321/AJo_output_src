/*
 * Decompiled with CFR 0.152.
 */
public final class YJ
extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public YJ(Throwable throwable) {
        super("Unexpected exception thrown by non-Glide code", throwable);
    }
}

