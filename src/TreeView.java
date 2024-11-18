import java.util.*;

public class TreeView {
    public static void treeViewBuilder(List<String> paths) {
        TreeNode root = new TreeNode("");

        for (String path : paths) {
            String[] parts = path.split("-");
            TreeNode current = root;
            for (String part : parts) {
                current = current.children.computeIfAbsent(part, k -> new TreeNode(part));
            }
        }
        printTree(root, 0);
    }

    private static void printTree(TreeNode node, int level) {
        if (!node.name.isEmpty()) {
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(node.name);
        }
        for (TreeNode child : node.children.values()) {
            printTree(child, level + 1);
        }
    }

    private static class TreeNode {
        String name;
        Map<String, TreeNode> children = new LinkedHashMap<>();

        TreeNode(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        List<String> arg1 = Arrays.asList(
                "A-B-C",
                "A-B-G",
                "A-B-H",
                "A-C-D",
                "A-C-K-L",
                "A-C-K-M",
                "A-E-F",
                "A-E-I",
                "A-E-J"
        );

        List<String> arg2 = Arrays.asList(
                "FLIGHT-REPORT-DOMESTIC",
                "HOTEL-REPORT-DOMESTIC",
                "FLIGHT-REPORT-INTERNATIONAL",
                "HOTEL-REPORT-INTERNATIONAL",
                "HOTEL-BOOKING-CONFIRMED",
                "HOTEL-BOOKING-CANCELED",
                "HOTEL-LIST",
                "VOLTRAS-BOD",
                "VOLTRAS-HR",
                "VOLTRAS-ITDEV-FRONT END-JUNIOR SOFTWARE ENGINEER",
                "VOLTRAS-ITDEV-FRONT END-SENIOR SOFTWARE ENGINEER",
                "VOLTRAS-ITDEV-BACK END-JUNIOR SOFTWARE ENGINEER",
                "VOLTRAS-ITDEV-BACK END-SENIOR SOFTWARE ENGINEER",
                "VOLTRAS-ITDEV-IT OPS"
        );

        System.out.println("Tree for arg1:");
        treeViewBuilder(arg1);

        System.out.println("\nTree for arg2:");
        treeViewBuilder(arg2);
    }
}