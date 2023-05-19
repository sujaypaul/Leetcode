enum Color { kWhite, kRed, kGreen }

class Solution {
  public boolean isBipartite(int[][] graph) {
    Color[] colors = new Color[graph.length];
    Arrays.fill(colors, Color.kWhite);

    for (int i = 0; i < graph.length; ++i) {
      // Already colored, do nothing
      if (colors[i] != Color.kWhite)
        continue;
      // colors[i] == Color.kWhite
      colors[i] = Color.kRed; // Always paint w/ Color.kRed
      // BFS
      Queue<Integer> q = new ArrayDeque<>(Arrays.asList(i));
      while (!q.isEmpty()) {
        for (int sz = q.size(); sz > 0; --sz) {
          final int u = q.poll();
          for (final int v : graph[u]) {
            if (colors[v] == colors[u])
              return false;
            if (colors[v] == Color.kWhite) {
              colors[v] = colors[u] == Color.kRed ? Color.kGreen : Color.kRed;
              q.offer(v);
            }
          }
        }
      }
    }

    return true;
  }
}
