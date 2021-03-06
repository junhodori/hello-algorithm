# hello-algorithm 
알고리즘이란 자료구조를 활용해서 어떤 알고리즘으로 짜는가에 대한 문제이다.

## 경우의 수 (Number Of Cases)
- 조합 (Combination)
    - N개에서 R개를 선택할 경우 `순서 없는` 모든 경우의 수
    
    
- 순열 (Permutation)
    - N개에서 R개를 선택할 경우 `순서 보장` 되는 모든 경우의 수

## 탐색 (Search)
- 선형 탐색법 (Linear Search)
    - `순차적`으로 탐색하는 알고리즘 입니다.
    
    
- 이진 탐색법 (Binary Search)
    - 정렬 되어 있는 데이터를 탐색하는 알고리즘 입니다.
    - 오름차순 정렬이 되어 있다면 모두 비교할 필요 없이 중간 값을 기준으로 찾고자 하는 값이 작으면 좌측, 크면 우측에서 `이분할`하면서 탐색합니다.
    
    
- 해시 탐색법 (Hash Search)
    - 해시 알고리즘으로 저장된 데이터를 탐색하는 알고리즘입니다.
    - 값이 저장된 위치를 `해시` 알고리즘으로 바로 접근하기 때문에 탐색 속도가 빠릅니다.

## 그래프 탐색 (Graph Search)
- 깊이 우선 탐색 (DFS)
    - `Stack`을 이용해 시작 노드로 부터 갈 수 있는 최대 깊이 만큼 방문하고, 더 이상 갈 곳이 없으면 이전 노드에서 다시 최대 깊이 만큼 방문하면서 깊이 우선으로 탐색하는 알고리즘이다.
    
    
- 너비 우선 탑색 (BFS)
    - `Queue`를 이용해서 시작 노드로 부터 가까운 노드 부터 모두 방문하고, 모두 방문하면 다음 단계의 노드에서 가까운 곳을 모두 방문하면서 너비 우선으로 탐색하는 알고리즘이다.
    
    
- 다익스트라 알고리즘 (Dijkstra algorithm)
    - 노드에서 다른 모든 노드까지의 `최단거리`를 구하는 알고리즘이다.
    - 단, 노드 간의 가중치 값에 음수가 있으면 사용하지 못한다.
    
    
## 정렬 (Sort)
- 선택 정렬 (Selection Sort)
    - 최소값을 `선택`하여 맨 앞부터 순서대로 나열하는 알고리즘이다.
    
    
- 버블 정렬 (Bubble Sort)
    - 뒤에서 부터 2개의 데이터를 서로 비교해서 교환하면서 점점 앞으로 정렬해나가는 알고리즘이다.
    - 교환 정렬이라고도 하며 정렬되는 모습이 마치 거품이 수면위로 올라오는 모습과 비슷하다고 하여 `버블` 정렬이라고 불린다.
    
    
- 삽입 정렬 (Insert Sort)
    - 대상 데이터를 올바른 위치에 `삽입`하는 알고리즘이다.
    - 중간 특정 위치에 끼워 넣으면 그 이후의 데이터들은 뒤로 밀리게 된다.
    - 실생활에서도 많이 활용하며 도서관에서 책을 정리할 때 중간에 책을 끼워 넣는 모습과 흡사하다.
    
      
- 퀵 정렬 (Quick Sort)
    - 기준 데이터를 기반으로 작은 것은 좌측 큰 것은 우측으로 보낸 뒤 대소 분할을 반복하여 쪼개면서 정렬하는 알고리즘이다.
    - 정렬이 빠르기 때문에 `퀵` 정렬이라고 불린다.
    
    
- 머지 정렬 (Merge Sort)
    - 이분할 통해 데이터를 분할 한뒤 `머지`를 할때 정렬을 하면서 합치는 알고리즘 이다.
    
     
- 힙 정렬 (Heap Sort)
    - `힙`이라는 데이터 구조(완전 이진 트리)를 이용한 알고리즘 이다.
    
    
- 셸 정렬 (Shell Sort)
    - `셸`(그룹)을 나누어서 삽입 정렬을 수행하는 알고리즘이다.
    - 삽입 정렬의 느린 속도를 개선한 알고리즘이다.


## 문제 해결법 (Problem Solution)
- 동적 계획법 (Dynamic Programming)
    - 큰 문제 해결을 위해 `작은 문제를 풀어 큰 문제를 해결`하는 방법이며 구체적인 알고리즘이기보단 문제해결 패러다임에 가깝다.
    - 하나의 문제는 단 한번만 풀도록 해야한다. 한번 푼 문제에 대해서 값을 저장하여 동일 문제를 다시 계산할 경우 재활용한다.
    - 예를 들어 피보나치 수열을 재귀호출로 해결할 경우 이미 계산 했던 값도 재귀호출이 끝나는 시점까지 계속 반복하게 되어 비효율적이지만, 동적 계획법을 사용할 경우에는 재귀호출을 실행하면서 한번 계산된 값은 메모리에 저장해 두면서 동일 값을 다시 계산해야 하는 경우 이미 저장된 값을 불러와서 사용한다.
    
    
- 그리디 알고리즘 (Greedy Algorithm)
    - 탐욕 알고리즘이라고도 불리며, 각 단계마다 지금 당장 가장 좋은 방법만을 선택하기 때문에 많은 경우 최적의 해를 찾지 못한다.
    - 대표적으로 배낭 문제(Knapsack Problem)가 있으며, 짐을 쪼갤 수 있는 경우는 분할가능 배낭 문제(Fractional Knapsack Problem)라고 하며 그리디 알고리즘으로 해결해야하고, 짐을 쪼갤 수 없는 경우는 0-1 배낭 문제(0-1 Knapsack Proble)라고 하며 동적 계획법으로 해결해야 한다.
    
     
## 수치 계산 (Numerical Calculation)
- 에라토스테네스의 체 (Sieve of Eratosthenes)
    - `소수`를 구하는 알고리즘이다.
    
    
- 유클리드 알고리즘 (Euclidean Algorithm)
    - `최대공약수`를 구하는 알고리즘이다.
