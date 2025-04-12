/*
 * Decompiled with CFR 0.152.
 */
public final class Un1
extends Enum {
    private static final /* synthetic */ Un1[] $VALUES;
    public static final /* enum */ Un1 CHARACTER_PALETTE;
    public static final /* enum */ Un1 COPY;
    public static final /* enum */ Un1 CUT;
    public static final /* enum */ Un1 DELETE_FROM_LINE_START;
    public static final /* enum */ Un1 DELETE_NEXT_CHAR;
    public static final /* enum */ Un1 DELETE_NEXT_WORD;
    public static final /* enum */ Un1 DELETE_PREV_CHAR;
    public static final /* enum */ Un1 DELETE_PREV_WORD;
    public static final /* enum */ Un1 DELETE_TO_LINE_END;
    public static final /* enum */ Un1 DESELECT;
    public static final /* enum */ Un1 DOWN;
    public static final /* enum */ Un1 END;
    public static final /* enum */ Un1 HOME;
    public static final /* enum */ Un1 LEFT_CHAR;
    public static final /* enum */ Un1 LEFT_WORD;
    public static final /* enum */ Un1 LINE_END;
    public static final /* enum */ Un1 LINE_LEFT;
    public static final /* enum */ Un1 LINE_RIGHT;
    public static final /* enum */ Un1 LINE_START;
    public static final /* enum */ Un1 NEW_LINE;
    public static final /* enum */ Un1 NEXT_PARAGRAPH;
    public static final /* enum */ Un1 PAGE_DOWN;
    public static final /* enum */ Un1 PAGE_UP;
    public static final /* enum */ Un1 PASTE;
    public static final /* enum */ Un1 PREV_PARAGRAPH;
    public static final /* enum */ Un1 REDO;
    public static final /* enum */ Un1 RIGHT_CHAR;
    public static final /* enum */ Un1 RIGHT_WORD;
    public static final /* enum */ Un1 SELECT_ALL;
    public static final /* enum */ Un1 SELECT_DOWN;
    public static final /* enum */ Un1 SELECT_END;
    public static final /* enum */ Un1 SELECT_HOME;
    public static final /* enum */ Un1 SELECT_LEFT_CHAR;
    public static final /* enum */ Un1 SELECT_LEFT_WORD;
    public static final /* enum */ Un1 SELECT_LINE_END;
    public static final /* enum */ Un1 SELECT_LINE_LEFT;
    public static final /* enum */ Un1 SELECT_LINE_RIGHT;
    public static final /* enum */ Un1 SELECT_LINE_START;
    public static final /* enum */ Un1 SELECT_NEXT_PARAGRAPH;
    public static final /* enum */ Un1 SELECT_PAGE_DOWN;
    public static final /* enum */ Un1 SELECT_PAGE_UP;
    public static final /* enum */ Un1 SELECT_PREV_PARAGRAPH;
    public static final /* enum */ Un1 SELECT_RIGHT_CHAR;
    public static final /* enum */ Un1 SELECT_RIGHT_WORD;
    public static final /* enum */ Un1 SELECT_UP;
    public static final /* enum */ Un1 TAB;
    public static final /* enum */ Un1 UNDO;
    public static final /* enum */ Un1 UP;
    private final boolean editsText;

    private static final /* synthetic */ Un1[] $values() {
        Un1 un1 = LEFT_CHAR;
        un1 = RIGHT_CHAR;
        un1 = RIGHT_WORD;
        un1 = LEFT_WORD;
        un1 = NEXT_PARAGRAPH;
        un1 = PREV_PARAGRAPH;
        un1 = LINE_START;
        un1 = LINE_END;
        un1 = LINE_LEFT;
        un1 = LINE_RIGHT;
        un1 = UP;
        un1 = DOWN;
        un1 = PAGE_UP;
        un1 = PAGE_DOWN;
        un1 = HOME;
        un1 = END;
        un1 = COPY;
        un1 = PASTE;
        un1 = CUT;
        un1 = DELETE_PREV_CHAR;
        un1 = DELETE_NEXT_CHAR;
        un1 = DELETE_PREV_WORD;
        un1 = DELETE_NEXT_WORD;
        un1 = DELETE_FROM_LINE_START;
        un1 = DELETE_TO_LINE_END;
        un1 = SELECT_ALL;
        un1 = SELECT_LEFT_CHAR;
        un1 = SELECT_RIGHT_CHAR;
        un1 = SELECT_UP;
        un1 = SELECT_DOWN;
        un1 = SELECT_PAGE_UP;
        un1 = SELECT_PAGE_DOWN;
        un1 = SELECT_HOME;
        un1 = SELECT_END;
        un1 = SELECT_LEFT_WORD;
        un1 = SELECT_RIGHT_WORD;
        un1 = SELECT_NEXT_PARAGRAPH;
        un1 = SELECT_PREV_PARAGRAPH;
        un1 = SELECT_LINE_START;
        un1 = SELECT_LINE_END;
        un1 = SELECT_LINE_LEFT;
        un1 = SELECT_LINE_RIGHT;
        un1 = DESELECT;
        un1 = NEW_LINE;
        un1 = TAB;
        un1 = UNDO;
        un1 = REDO;
        un1 = CHARACTER_PALETTE;
        Un1[] un1Array = new Un1[]{un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1, un1};
        return un1Array;
    }

    static {
        Un1 un1;
        LEFT_CHAR = un1 = new Un1("LEFT_CHAR", 0, false);
        boolean bl2 = true;
        RIGHT_CHAR = un1 = new Un1("RIGHT_CHAR", (int)(bl2 ? 1 : 0), false);
        RIGHT_WORD = un1 = new Un1("RIGHT_WORD", 2, false);
        LEFT_WORD = un1 = new Un1("LEFT_WORD", 3, false);
        NEXT_PARAGRAPH = un1 = new Un1("NEXT_PARAGRAPH", 4, false);
        PREV_PARAGRAPH = un1 = new Un1("PREV_PARAGRAPH", 5, false);
        LINE_START = un1 = new Un1("LINE_START", 6, false);
        LINE_END = un1 = new Un1("LINE_END", 7, false);
        LINE_LEFT = un1 = new Un1("LINE_LEFT", 8, false);
        LINE_RIGHT = un1 = new Un1("LINE_RIGHT", 9, false);
        UP = un1 = new Un1("UP", 10, false);
        DOWN = un1 = new Un1("DOWN", 11, false);
        PAGE_UP = un1 = new Un1("PAGE_UP", 12, false);
        PAGE_DOWN = un1 = new Un1("PAGE_DOWN", 13, false);
        HOME = un1 = new Un1("HOME", 14, false);
        END = un1 = new Un1("END", 15, false);
        COPY = un1 = new Un1("COPY", 16, false);
        PASTE = un1 = new Un1("PASTE", 17, bl2);
        CUT = un1 = new Un1("CUT", 18, bl2);
        DELETE_PREV_CHAR = un1 = new Un1("DELETE_PREV_CHAR", 19, bl2);
        DELETE_NEXT_CHAR = un1 = new Un1("DELETE_NEXT_CHAR", 20, bl2);
        DELETE_PREV_WORD = un1 = new Un1("DELETE_PREV_WORD", 21, bl2);
        DELETE_NEXT_WORD = un1 = new Un1("DELETE_NEXT_WORD", 22, bl2);
        DELETE_FROM_LINE_START = un1 = new Un1("DELETE_FROM_LINE_START", 23, bl2);
        DELETE_TO_LINE_END = un1 = new Un1("DELETE_TO_LINE_END", 24, bl2);
        SELECT_ALL = un1 = new Un1("SELECT_ALL", 25, false);
        SELECT_LEFT_CHAR = un1 = new Un1("SELECT_LEFT_CHAR", 26, false);
        SELECT_RIGHT_CHAR = un1 = new Un1("SELECT_RIGHT_CHAR", 27, false);
        SELECT_UP = un1 = new Un1("SELECT_UP", 28, false);
        SELECT_DOWN = un1 = new Un1("SELECT_DOWN", 29, false);
        SELECT_PAGE_UP = un1 = new Un1("SELECT_PAGE_UP", 30, false);
        SELECT_PAGE_DOWN = un1 = new Un1("SELECT_PAGE_DOWN", 31, false);
        SELECT_HOME = un1 = new Un1("SELECT_HOME", 32, false);
        SELECT_END = un1 = new Un1("SELECT_END", 33, false);
        SELECT_LEFT_WORD = un1 = new Un1("SELECT_LEFT_WORD", 34, false);
        SELECT_RIGHT_WORD = un1 = new Un1("SELECT_RIGHT_WORD", 35, false);
        SELECT_NEXT_PARAGRAPH = un1 = new Un1("SELECT_NEXT_PARAGRAPH", 36, false);
        SELECT_PREV_PARAGRAPH = un1 = new Un1("SELECT_PREV_PARAGRAPH", 37, false);
        SELECT_LINE_START = un1 = new Un1("SELECT_LINE_START", 38, false);
        SELECT_LINE_END = un1 = new Un1("SELECT_LINE_END", 39, false);
        SELECT_LINE_LEFT = un1 = new Un1("SELECT_LINE_LEFT", 40, false);
        SELECT_LINE_RIGHT = un1 = new Un1("SELECT_LINE_RIGHT", 41, false);
        DESELECT = un1 = new Un1("DESELECT", 42, false);
        NEW_LINE = un1 = new Un1("NEW_LINE", 43, bl2);
        TAB = un1 = new Un1("TAB", 44, bl2);
        UNDO = un1 = new Un1("UNDO", 45, bl2);
        REDO = un1 = new Un1("REDO", 46, bl2);
        CHARACTER_PALETTE = un1 = new Un1("CHARACTER_PALETTE", 47, bl2);
        $VALUES = Un1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Un1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.editsText = var3_2;
    }

    public static Un1 valueOf(String string2) {
        return Enum.valueOf(Un1.class, string2);
    }

    public static Un1[] values() {
        return (Un1[])$VALUES.clone();
    }

    public final boolean getEditsText() {
        return this.editsText;
    }
}

