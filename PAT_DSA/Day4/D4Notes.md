Comparator:
- in the comparator interface, there is already a logic that is present.
- we use a lambda function to override the origional in-build default logic and create our own logic.
- Comparator<Integer> cmp = (Integer a, Integer b) -> {--logic--};