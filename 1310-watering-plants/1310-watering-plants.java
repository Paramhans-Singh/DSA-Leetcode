class Solution {
    public int wateringPlants(int[] plants, int capacity) {
       int n=plants.length;
    int ans=0;
    int temp=capacity;//Water currently in the can
for(int i=0;i<n;i++)
{
    if(plants[i]>temp)
    {
        ans+=(2*i);//Steps required to re-fill the can and come back
        temp=capacity;//Re-filling the water can
    }
    ans+=1;
    temp-=plants[i];
}
        return ans;

    }
}