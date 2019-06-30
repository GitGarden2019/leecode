package com.geekbang;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 图
 */
public class Graph {
     //顶点数组
     private  Vertex[] vertextList;

     //邻接矩阵
    private int[][] adjMat;

    //顶点的最大数目
    private int maxSize;

    //当前顶点
    private  int nVertex;




    public Graph(int maxSize){
        this.maxSize=maxSize;
        vertextList=new Vertex[maxSize];
        adjMat=new int[maxSize][maxSize];


        for(int i=0;i<maxSize;i++){
            for(int j=0;j<maxSize;j++){
                adjMat[i][j]=0;
            }
        }
        nVertex=0;
    }

    /**
     * 添加顶点
     * @param label
     */
    public void addVertext(char label){
        vertextList[nVertex++]=new Vertex(label);
    }

    /**
     * 添加边
     * @param start
     * @param end
     */
    public void addEdge(int start,int end){
        adjMat[start][end]=1;
        adjMat[end][start]=1;
    }




    /**
     * 找到一个邻接的，并且没有被访问过的节点，如果找不到则返回-1
     * @param v
     * @return
     */
    public int getAdjUnvisitedVertex(int v){

        for(int i=0;i<nVertex;i++){
            //邻接的&&没有被访问过的
            if(adjMat[v][i]==1&&!vertextList[i].wasVisted){
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取所有没有被访问到的邻接点
     * @param v
     * @return
     */
    public List getAdjUnvisitedVertexAll(int v){
        List arrv=new ArrayList();
        for(int i=0;i<nVertex;i++){
            //邻接的&&没有被访问过的
            if(adjMat[v][i]==1&&!vertextList[i].wasVisted){
                arrv.add(i);
            }
        }
        return arrv;
    }

    /**
     * 搜索规则:
     * 1.访问一个邻接的，未被访问过的顶点，标记塔，并把他放入栈中
     * 2.当不能执行规则1时，如果栈不能为空，就从栈中弹出一个顶点
     * 3.不能执行规则1和规则2时，搜索结束
     */
    public void dfs(){
         Stack stack=new Stack();
        //首先访问0号顶点
        vertextList[0].wasVisted=true;

        stack.push(0);
        displayVertex(0);

        while (!stack.isEmpty()){
            int v=getAdjUnvisitedVertex((int)stack.peek());
            if(v==-1){
                stack.pop();//找不到未被访问过的顶点
            }else{
                vertextList[v].wasVisted=true;
                displayVertex(v);
                stack.push(v);
            }
        }

        //搜索完成之后要将访问信息进行复原
        for (int i=0;i<nVertex;i++){
            vertextList[i].wasVisted=false;
        }

    }

    /**
     * 1.访问下一个邻接的没有被访问过的顶点，这个节点必须是当前节点的邻节点，标记他，并把他插入到队列中
     * 2.如果无法执行规则1，就从队首重取出一个顶点，并使其作为当前顶点
     * 3.当丢了为空不能执行规则2时，就完成了整个搜索过程
     */
    public void bfs(){
        Queue queue=new ArrayDeque();
        //首先访问0号顶点
        queue.offer(0);
        vertextList[0].wasVisted=true;
        while (!queue.isEmpty()){
            int v=(int)queue.poll();
            displayVertex(v);
            //入队列之后的数据为被标记过
            List unvisitedVertexAll=getAdjUnvisitedVertexAll(v);
            if(unvisitedVertexAll.size()!=0){
                for(int i=0;i<unvisitedVertexAll.size();i++){
                    int x=(int)unvisitedVertexAll.get(i);
                    vertextList[x].wasVisted=true;
                    queue.offer(x);
                }
            }


        }
        //搜索完成之后要将访问信息进行复原
        for (int i=0;i<nVertex;i++){
            vertextList[i].wasVisted=false;
        }

    }

    /**
     * 显示某个顶点
     * @param v
     */
    public void displayVertex(int v){
        System.out.print(vertextList[v].getLable()+" ");
    }

    /**
     * 打印一张图的邻接矩阵
     */
    public void display(){
        //打印标签
        System.out.print("  ");
        for(int i=0;i<maxSize;i++){
            System.out.print(vertextList[i].getLable()+" ");
        }
        System.out.println();


        for(int i=0;i<maxSize;i++){
            System.out.print(vertextList[i].getLable()+" ");
            for(int j=0;j<maxSize;j++){

                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static Graph g1(){

        Graph g=new Graph(4);

        g.addVertext('A');
        g.addVertext('B');
        g.addVertext('C');
        g.addVertext('D');

        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(2,3);
        return g;
    }


    public static Graph g2(){

        Graph g=new Graph(6);

        g.addVertext('A');
        g.addVertext('B');
        g.addVertext('C');
        g.addVertext('D');
        g.addVertext('E');
        g.addVertext('F');

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);

        g.addEdge(1,4);
        g.addEdge(1,5);

        g.addEdge(2,3);
        g.addEdge(2,5);
        return g;
    }

    public static void main(String[] args) {

        Graph g= g2();

        g.display();

        System.out.println("dfs:");
        g.dfs();

        System.out.println("\nbfs:");
        g.bfs();


    }







}
