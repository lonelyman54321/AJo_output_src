/*
 * Decompiled with CFR 0.152.
 */
public final class vj3$a {
    public static vj3_2 a(String object) {
        block14: {
            boolean bl2;
            block13: {
                if (object == null) break block13;
                int n3 = object.hashCode();
                switch (n3) {
                    default: {
                        break;
                    }
                    case 1501467704: {
                        String string2 = "pt_rating";
                        bl2 = object.equals(string2);
                        if (!bl2) break;
                        object = vj3_2.RATING;
                        break block14;
                    }
                    case 1071845653: {
                        String string3 = "pt_cancel";
                        bl2 = object.equals(string3);
                        if (!bl2) break;
                        object = vj3_2.CANCEL;
                        break block14;
                    }
                    case 923207991: {
                        String string4 = "pt_product_display";
                        bl2 = object.equals(string4);
                        if (!bl2) break;
                        object = vj3_2.PRODUCT_DISPLAY;
                        break block14;
                    }
                    case 329446016: {
                        String string5 = "pt_video";
                        bl2 = object.equals(string5);
                        if (!bl2) break;
                        object = vj3_2.VIDEO;
                        break block14;
                    }
                    case 327607626: {
                        String string6 = "pt_timer";
                        bl2 = object.equals(string6);
                        if (!bl2) break;
                        object = vj3_2.TIMER;
                        break block14;
                    }
                    case 317601231: {
                        String string7 = "pt_input";
                        bl2 = object.equals(string7);
                        if (!bl2) break;
                        object = vj3_2.INPUT_BOX;
                        break block14;
                    }
                    case 310751795: {
                        String string8 = "pt_basic";
                        bl2 = object.equals(string8);
                        if (!bl2) break;
                        object = vj3_2.BASIC;
                        break block14;
                    }
                    case -622393029: {
                        String string9 = "pt_carousel";
                        bl2 = object.equals(string9);
                        if (!bl2) break;
                        object = vj3_2.AUTO_CAROUSEL;
                        break block14;
                    }
                    case -629497790: {
                        String string10 = "pt_zero_bezel";
                        bl2 = object.equals(string10);
                        if (!bl2) break;
                        object = vj3_2.ZERO_BEZEL;
                        break block14;
                    }
                    case -1531478936: {
                        String string11 = "pt_five_icons";
                        bl2 = object.equals(string11);
                        if (!bl2) break;
                        object = vj3_2.FIVE_ICONS;
                        break block14;
                    }
                    case -1726683778: {
                        String string12 = "pt_manual_carousel";
                        bl2 = object.equals(string12);
                        if (!bl2) break;
                        object = vj3_2.MANUAL_CAROUSEL;
                        break block14;
                    }
                }
            }
            bl2 = false;
            object = null;
        }
        return object;
    }
}

