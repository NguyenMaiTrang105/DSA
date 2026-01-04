package DSA10GraphBFS;

public class GraphBFS {
        private static int n = 7;
        private static int[][] a = {
                {0, 1, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 0},
                {1, 0, 0, 1, 0, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0}
        };
        private static GVertex[] v;

        /**
         * Constructor for objects of class GraphBFS
         */
        public GraphBFS() {
        }
        public static void BFS(int s){
            for (int u=0;u<n;u++)
                v[u].setColor('B');
            v[s].setColor('Y');
            System.out.print(v[s].getLabel()+" ");
            ArrayQueue q =new ArrayQueue();
            q.enqueue(s);
            while (!q.isEmpty()){
                int u=q.dequeue();
                for(int w=0;w<n;w++){
                    if((a[u][w]==1));
                }
        }

    }
}
