#include<stdio.h>
#include<conio.h>
int a[],x;
int top=-1;
void push();
void pop();

int main(){
	int i;
	for( i=0;i<5;i++){
		push();
		
	}

int j;
for(j=0;j<5;j++){
	pop();
}
	
}
void push(){
	if(top==a-1){
		printf("The stack is fill");
	
	}
	else{
		printf("push the element:  \n");
		scanf("%d",&x);
		top++;
		a[top]=x;
//		printf("%d\n",a[top]);
	}
//printf("h");
}
void pop(){
	if(top==-1){
		printf("STACK is Empty");
	}
	else{
		printf("Poped Element:%d\n",a[top]);
		top--;
	}
}

