int CalculateNumber(int mul);

int main(void) {
	int a, b, c;
	unsigned long int mul = 0; // 입력 받은 수의 곱
	int cnt; // 자리 수
	int arr[10] = { 0 };
	int i;
	int op = 1; // 나누는 값
	int temp; // 몫

	do {
		scanf("%d %d %d", &a, &b, &c);
	} while (!(a >= 100 || b >= 100 || c >= 100) || !(a < 1000 || b < 1000 || c < 1000));

	mul = a * b * c;

	cnt = CalculateNumber(mul);
	for (i = 0; i < cnt - 1; i++) {
		op = op * 10;
	}

	temp = mul;
	while (mul > 0) {
		temp = mul / op;
		mul = mul % op;
		op = op / 10;

		arr[temp]++;

		if (mul == 0 && (op >= 1)) {
			for (i = 0; i < CalculateNumber(op); i++) {
				arr[0]++;
			}
		}
	}

	for (i = 0; i < 10; i++) {
		printf("%d\n", arr[i]);
	}
}

// 자리수를 계산한다.
int CalculateNumber(int mul) {
	int r; // 나머지
	int m; // 몫
	int pos = 1; // 자리 수

	while (mul >= 10) {
		mul = mul / 10;
		pos++;
	}

	return pos;
}