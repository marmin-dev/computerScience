#include <bits/stdc++.h>
stack<int> stk;
using namespace std;
int main()
{
  ios+base::sync_with_stdio(false);
  cin.tie(NULL);
  for(int i = 0; i< 10; i++)stk.push(i);
  while(stk.size()){
      cout << stk.top()" ";
      stk.pop();
  }
}
