package com.example.okaynowthisisit.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 1;

    static {
        // Add some sample items.
        addItem(new DummyItem("1",  "On the Job Support",
                "You'll have to contact the supervisor of this job, and in future please contact them first."));
        addItem(new DummyItem("2", " Need help finding us?",
                "You'll find our local address on the Contact information page." ));
        addItem(new DummyItem("3", "Can't seen to catch a bird?",
                "Feel free to contact us via phone which is located at on the contact info page." ));

        addItem(new DummyItem("4", "Need us NOW!",
                "Call visit our website to find out emergency contact information." ));
        addItem(new DummyItem("5", "Need help navigating our new app?",
                "Give us a call!" ));
        addItem(new DummyItem("6", "Payments",
                "Payments can be done over the phone or over the internet via our website." ));
        addItem(new DummyItem("7", "Account Settings",
                "Change email or password, or update login information" ));
        addItem(new DummyItem("8", "Refund?",
                "Call us over the phone to allow us to make sure your refunded with everything." ));
        addItem(new DummyItem("9", "Need more help?",
                "Give us a call for any of your needs." ));
        addItem(new DummyItem("10", "Interested in learning how to catch birds?",
                "please contact us via webiste careers at the bottom of the page." ));

    }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Customer care " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
